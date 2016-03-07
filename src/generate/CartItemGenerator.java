package generate;

import model.CartItem;
import model.Item;
import promotion.Promotion;
import source.DataLoader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by nancymi on 16/3/5.
 */
public class CartItemGenerator {

    private List<CartItem> cartItemList = new ArrayList<>();

    private HashMap<Item, Float> tagMap = new HashMap<>();

    public List<CartItem> generate(List<String> tagStrList) {

        for (String tagStr : tagStrList) {
            extractMsg(tagStr);
        }

        List<Item> items = DataLoader.loadAllItems();
        for (Item item : items) {
            if (tagMap.containsKey(item))  {
                CartItem cartItem = new CartItem(item, tagMap.get(item));
                addPromotionType(cartItem);
                cartItemList.add(cartItem);
            }
        }

        return cartItemList;
    }

    private void extractMsg(String tagStr) {

        String[] tag = tagStr.split("-");
        Item item = findItem(tag[0]);
        float count = tag.length == 1 ? 1 : Float.parseFloat(tag[1]);

        if (tagMap.containsKey(item)) {
            tagMap.replace(item, tagMap.get(item) + count);
        } else {
            tagMap.put(item, count);
        }

    }

    private Item findItem(String barcode) {
        List<Item> items = DataLoader.loadAllItems();
        for (Item item : items) {
            if (item.getBarcode().equals(barcode))
                return item;
        }

        return null;
    }

    private void addPromotionType(CartItem cartItem) {
        List<Promotion> promotionList = DataLoader.loadPromotions();

        promotionList.forEach((promotion) -> {

            for (String barcode : promotion.getBarcodes()) {
                if (cartItem.getItem().getBarcode().equals(barcode)) {
                    cartItem.setPromotionType(promotion.getPromotionType());
                    break;
                }
            }

        });
    }

}

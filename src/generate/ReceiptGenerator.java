package generate;

import model.CartItem;
import model.Receipt;

import java.util.List;

/**
 * Created by nancymi on 16/3/5.
 */
public class ReceiptGenerator {

    private Receipt receipt;

    private CartItemGenerator cartItemGenerator;

    public String generate(List<String> tagList) {

        cartItemGenerator = new CartItemGenerator();

        List<CartItem> cartItemList = cartItemGenerator.generate(tagList);
        float totalNormalPrice = calculateTotalNormalPrice(cartItemList);
        float totalPromotePrice = calculateTotalPromotePrice(cartItemList);

        receipt = new Receipt(cartItemList, totalNormalPrice, totalPromotePrice);

        return receipt.toString();
    }

    private float calculateTotalNormalPrice(List<CartItem> cartItemList) {

        float totalNormalPrice = 0;

        for (CartItem cartItem : cartItemList) {
            totalNormalPrice += cartItem.getNormalPrice();
        }

        return totalNormalPrice;
    }

    private float calculateTotalPromotePrice(List<CartItem> cartItemList) {
        float totalPromotePrice = 0;

        for (CartItem cartItem : cartItemList) {
            totalPromotePrice += cartItem.getPromotePrice();
        }

        return totalPromotePrice;
    }

}

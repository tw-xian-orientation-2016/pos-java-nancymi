package source;

import model.Item;
import promotion.Promotion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by nancymi on 16/3/4.
 */
public class DataLoader {

    public static List<Item> loadAllItems() {
        List<Item> itemList = new ArrayList<>();
        Collections.addAll(itemList, DataSource.getITEMS());

        return itemList;
    }

    public static List<Promotion> loadPromotions() {
        List<Promotion> promotionList = new ArrayList<>();
        Collections.addAll(promotionList, DataSource.getPROMOTIONS());

        return promotionList;
    }
}

package source;

import model.Item;
import promotion.Promotion;

public class DataSource {

    private static final Item[] ITEMS = new Item[] {
            new Item("ITEM000000", "可口可乐", "瓶", 3),
            new Item("ITEM000001", "雪碧", "瓶", 3),
            new Item("ITEM000002", "苹果", "斤", (float)5.5),
            new Item("ITEM000003", "荔枝", "斤",15 ),
            new Item("ITEM000004", "电池", "个", 2),
            new Item("ITEM000005", "方便面", "袋", (float)4.5)
    };

    private static final Promotion[] PROMOTIONS = new Promotion[] {
           new Promotion("BUY_TWO_GET_ONE_FREE", new String[]{"ITEM000000", "ITEM000001", "ITEM000005"})
    };

    public static Item[] getITEMS() {
        return ITEMS;
    }

    public static Promotion[] getPROMOTIONS() {
        return PROMOTIONS;
    }
}

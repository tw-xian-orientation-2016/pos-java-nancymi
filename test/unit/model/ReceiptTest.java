package unit.model;

import model.CartItem;
import model.Item;
import model.Receipt;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by nancymi on 16/3/5.
 */
public class ReceiptTest {
    
    List<CartItem> cartItemList = new ArrayList<CartItem>();

    Receipt receipt;

    @Before
    public void setUp() throws Exception {
        CartItem cartItem1 = new CartItem(new Item("ITEM000001", "雪碧", "瓶", (float)3), 5);
        cartItem1.setPromotionType("BUY_TWO_GET_ONE_FREE");

        cartItemList.add(cartItem1);

        CartItem cartItem2 = new CartItem(new Item("ITEM000003", "荔枝", "斤",15 ), 2);

        cartItemList.add(cartItem2);

        CartItem cartItem3 = new CartItem(new Item("ITEM000005", "方便面", "袋", (float)4.5), 3);
        cartItem3.setPromotionType("BUY_TWO_GET_ONE_FREE");

        cartItemList.add(cartItem3);

        receipt = new Receipt(cartItemList, (float)58.5, (float)51);

    }

    @Test
    public void testToString() throws Exception {
        assertEquals(receipt.toString(), "***<没钱赚商店>收据***\n" +
                "名称：雪碧，数量：5瓶，单价：3.00(元)，小计：12.00(元)\n" +
                "名称：荔枝，数量：2斤，单价：15.00(元)，小计：30.00(元)\n" +
                "名称：方便面，数量：3袋，单价：4.50(元)，小计：9.00(元)\n" +
                "----------------------\n" +
                "总计：51.00(元)\n" +
                "节省：7.50(元)\n" +
                "**********************");
    }

}
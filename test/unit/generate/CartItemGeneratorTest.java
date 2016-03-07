package unit.generate;

import generate.CartItemGenerator;
import model.CartItem;
import model.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by nancymi on 16/3/5.
 */
public class CartItemGeneratorTest {

    private CartItemGenerator cartItemGenerator;

    private List<CartItem> cartItemList = new ArrayList<>();

    private List<String> tagList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {

        cartItemGenerator = new CartItemGenerator();

        Collections.addAll(tagList, new String[] {
                "ITEM000001",
                "ITEM000001",
                "ITEM000001",
                "ITEM000001",
                "ITEM000001",
                "ITEM000003-2",
                "ITEM000005",
                "ITEM000005",
                "ITEM000005"
        });

        CartItem cartItem1 = new CartItem(new Item("ITEM000001", "雪碧", "瓶", (float)3), 5);
        cartItem1.setPromotionType("BUY_TWO_GET_ONE_FREE");

        cartItemList.add(cartItem1);

        CartItem cartItem2 = new CartItem(new Item("ITEM000003", "荔枝", "斤",15 ), 2);

        cartItemList.add(cartItem2);

        CartItem cartItem3 = new CartItem(new Item("ITEM000005", "方便面", "袋", (float)4.5), 3);
        cartItem3.setPromotionType("BUY_TWO_GET_ONE_FREE");

        cartItemList.add(cartItem3);
    }

    @Test
    public void testGenerate() throws Exception {
        List<CartItem> expectCartItemList = cartItemGenerator.generate(tagList);

        assertEquals(cartItemList.get(0).toString(), expectCartItemList.get(0).toString());
        assertEquals(cartItemList.get(1).toString(), expectCartItemList.get(1).toString());
        assertEquals(cartItemList.get(2).toString(), expectCartItemList.get(2).toString());
    }
}
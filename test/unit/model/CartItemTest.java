package unit.model;

import model.CartItem;
import model.Item;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by nancymi on 16/3/5.
 */
public class CartItemTest {

    Item item = new Item("ITEM000001", "雪碧", "瓶", 3);

    CartItem cartItem = new CartItem(item, 2);

    @Before
    public void setUp() throws Exception {
        cartItem.setPromotionType("BUY_TWO_GET_ONE_FREE");
    }

    @Test
    public void when_get_item_then_return_item() throws Exception {
        assertThat(item.toString(), is(cartItem.getItem().toString()));
    }

    @Test
    public void when_get_count_then_return_count() throws Exception {
        assertThat((float)2, is(cartItem.getCount()));
    }

    @Test
    public void when_get_normal_price_then_return_normal_price() throws Exception {
        assertThat((float)6, is(cartItem.getNormalPrice()));
    }

    @Test
    public void when_get_promotion_type_then_get_promotion_type() throws Exception {
        assertThat("BUY_TWO_GET_ONE_FREE", is(cartItem.getPromotionType()));
    }

    @Test
    public void when_get_promote_price_then_get_promotion_price() throws Exception {
        assertThat((float)6, is(cartItem.getPromotePrice()));
    }

    @Test
    public void when_call_tostring_then_return_cart_item_message() throws Exception {
        assertThat("名称：雪碧，数量：2瓶，单价：3.00(元)，小计：6.00(元)", is(cartItem.toString()));
    }
}
package unit.promotion;

import model.CartItem;
import model.Item;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by nancymi on 16/3/5.
 */
public class PromotionTypeTest {

    CartItem cartItem = new CartItem(new Item("BARCODE", "测试数据", "unit", (float)2.5), 3);

    @Test
    public void when_calculate_promotion_type_1_then_return_promotion_price() throws Exception {

        cartItem.setPromotionType("BUY_TWO_GET_ONE_FREE");

        assertThat(cartItem.getPromotePrice(), is((float)5.00));

    }

    @Test
    public void when_calculate_promotion_type_2_then_return_promotion_price() throws Exception {
        cartItem.setPromotionType("OTHER_PROMOTION");

        assertThat(cartItem.getPromotePrice(), is((float)7.50));
    }
}
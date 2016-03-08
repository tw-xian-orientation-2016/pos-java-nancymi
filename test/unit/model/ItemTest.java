package unit.model;

import model.Item;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by nancymi on 16/3/5.
 */
public class ItemTest {

    Item item = new Item("ITEM000001", "雪碧", "瓶", 3);

    @Test
    public void when_get_barcode_then_return_barcode() throws Exception {
        assertThat("ITEM000001", is(item.getBarcode()));
    }

    @Test
    public void when_get_name_then_return_name() throws Exception {
        assertThat("雪碧", is(item.getName()));
    }

    @Test
    public void when_get_unit_then_return_unit() throws Exception {
        assertThat("瓶", is(item.getUnit()));
    }

    @Test
    public void when_get_price_then_return_price() throws Exception {
        assertThat((float)3, is(item.getPrice()));
    }
}
package unit.promotion;

import org.junit.Before;
import org.junit.Test;
import promotion.Promotion;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by nancymi on 16/3/5.
 */
public class PromotionTest {

    Promotion promotion;

    @Before
    public void setUp() throws Exception {
        promotion = new Promotion("BUY_TWO_GET_ONE_FREE", new String[] {
                "ITEM000000",
                "ITEM000001"
        });

    }

    @Test
    public void testGetPromotionType() throws Exception {
        assertThat(promotion.getPromotionType(), is("BUY_TWO_GET_ONE_FREE"));
    }

    @Test
    public void testGetBarcodes() throws Exception {

        String[] barcodes = new String[]{"ITEM000000", "ITEM000001"};



        assertThat(promotion.getBarcodes().toArray(), is(barcodes));
    }
}
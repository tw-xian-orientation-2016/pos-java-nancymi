package promotion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by nancymi on 16/3/5.
 */
public class Promotion {

    private final String promotionType;

    private final List<String> barcodes= new ArrayList<String>();

    public Promotion(String promotionType, String[] barcodes) {
        this.promotionType = promotionType;
        Collections.addAll(this.barcodes, barcodes);
    }

    public String getPromotionType() {
        return promotionType;
    }

    public List<String> getBarcodes() {
        return barcodes;
    }

}

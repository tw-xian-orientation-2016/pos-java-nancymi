package model;

import promotion.PromotionType;

public class CartItem {

    private final Item item;

    private float count;

    private String promotionType;

    public CartItem(Item item, float count) {
        this.item = item;
        this.count = count;
    }

    public Item getItem() {
        return item;
    }

    public float getCount() {
        return count;
    }

    public float getNormalPrice() {

        float normalPrice = item.getPrice() * count;

        return normalPrice;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public float getPromotePrice() {
        float promotePrice;

        if (promotionType != null) {
            promotePrice = PromotionType.valueOf(promotionType).getPromotePrice(this);
        } else {
            promotePrice = getNormalPrice();
        }

        return promotePrice;
    }

    @Override
    public String toString() {
        return  "名称：" + item.getName() + "，" +
                "数量：" + String.format("%d", (int)count) + item.getUnit() + "，" +
                "单价：" + String.format("%.2f", item.getPrice()) + "(元)，" +
                "小计：" + String.format("%.2f", getPromotePrice()) + "(元)";
    }
}

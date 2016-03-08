package model;

import java.util.List;

/**
 * Created by nancymi on 16/3/5.
 */
public class Receipt {

    private List<CartItem> cartItemList;

    private float totalNormalPrice;

    private float totalPromotePrice;

    public Receipt(List<CartItem> cartItemList, float totalNormalPrice, float totalPromotePrice) {
        this.cartItemList = cartItemList;
        this.totalNormalPrice = totalNormalPrice;
        this.totalPromotePrice = totalPromotePrice;
    }


    @Override
    public String toString() {
        String shoppingCartStr = "***<没钱赚商店>收据***\n";
        for (CartItem cartItem : cartItemList) {
            shoppingCartStr += cartItem.toString() + "\n";
        }
        shoppingCartStr += ("----------------------\n" +
                "总计："+ String.format("%.2f", totalPromotePrice) + "(元)\n" +
                "节省："+ String.format("%.2f", totalNormalPrice - totalPromotePrice) + "(元)\n" +
                "**********************");
        return shoppingCartStr;
    }
}

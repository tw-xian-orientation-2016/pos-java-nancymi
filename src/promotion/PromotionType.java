package promotion;

import model.CartItem;

/**
 * Created by nancymi on 16/3/4.
 */
public enum PromotionType implements PromotionAction {
    BUY_TWO_GET_ONE_FREE {
        @Override
        public float getPromotePrice(CartItem cartItem) {
            float promoPrice = cartItem.getItem().getPrice();
            float promoCount = cartItem.getCount() - (int)(cartItem.getCount()/3);
            float itemPromotePrice = promoPrice * promoCount;
            return itemPromotePrice;
        }
    },
    OTHER_PROMOTION {
        @Override
        public float getPromotePrice(CartItem cartItem) {
            return cartItem.getItem().getPrice() * cartItem.getCount();
        }
    }
}

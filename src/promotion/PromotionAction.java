package promotion;

import model.CartItem;

/**
 * Created by nancymi on 16/3/4.
 */
public interface PromotionAction {
    float getPromotePrice(CartItem cartItem);
}

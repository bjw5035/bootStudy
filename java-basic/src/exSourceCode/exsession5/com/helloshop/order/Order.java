package exSourceCode.exsession5.com.helloshop.order;

import exSourceCode.exsession5.com.helloshop.product.Product;
import exSourceCode.exsession5.com.helloshop.user.User;


public class Order {

    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}

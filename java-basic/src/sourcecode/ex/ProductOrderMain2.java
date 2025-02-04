package sourcecode.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        exProductOrder[] productOrders = new exProductOrder[10];

        productOrders[0] = createProductOrder("두부", 200, 2);

        printOrder(productOrders);

        int total = getTotalPrice(productOrders);
        System.out.println(total);
    }

    static exProductOrder createProductOrder(String productName, int price, int quantity) {
        exProductOrder order = new exProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(exProductOrder[] productOrders) {
        for (exProductOrder order : productOrders) {
            System.out.println(order);
        }
    }

    static int getTotalPrice(exProductOrder[] productOrders) {
        int totalPrice = 0;
        for(exProductOrder order : productOrders) {
            totalPrice += order.price;
        }
        return totalPrice;
    }

}

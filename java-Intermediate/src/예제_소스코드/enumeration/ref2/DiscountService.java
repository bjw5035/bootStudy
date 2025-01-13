package 예제_소스코드.enumeration.ref2;

public class DiscountService {

    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}

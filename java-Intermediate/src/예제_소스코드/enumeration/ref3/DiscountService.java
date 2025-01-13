package 예제_소스코드.enumeration.ref3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}

package sourcecode.session10.poly.ex.pay1;

public class NewPay implements Pay {


    @Override
    public boolean pay(int amount) {
        System.out.println("NewPay �ý��۰� �����մϴ�.");
        System.out.println(amount + "�� ������ �õ��մϴ�.");
        return true;
    }
}

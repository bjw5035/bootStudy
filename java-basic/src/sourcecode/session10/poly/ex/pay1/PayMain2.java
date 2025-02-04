package sourcecode.session10.poly.ex.pay1;

import java.util.Scanner;
import sourcecode.session10.poly.ex.pay0.PayService;

public class PayMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.println("���� ������ �Է��ϼ��� : ");
            String payOption = sc.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("���α׷��� �����մϴ�");
                return;
            }

            System.out.println("���� �ݾ��� �Է��ϼ��� : ");
            int amount = sc.nextInt();
            sc.nextLine();

            payService.processPay(payOption, amount);
        }

    }

}

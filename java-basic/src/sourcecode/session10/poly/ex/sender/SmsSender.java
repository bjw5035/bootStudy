package sourcecode.session10.poly.ex.sender;

public class SmsSender implements Sender {

    @Override
    public void sendMessage(String s) {
        System.out.println("SMS를 발송합니다");
    }
}

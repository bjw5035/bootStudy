package sourcecode.session10.poly.ex.sender;

public class EmailSender implements Sender {

    @Override
    public void sendMessage(String s) {
        System.out.println("메일을 발송합니다.");
    }
}

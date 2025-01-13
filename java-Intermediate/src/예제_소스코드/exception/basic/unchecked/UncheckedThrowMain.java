package 예제_소스코드.exception.basic.unchecked;

public class UncheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}

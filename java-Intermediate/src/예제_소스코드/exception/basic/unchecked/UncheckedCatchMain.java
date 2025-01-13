package 예제_소스코드.exception.basic.unchecked;

public class UncheckedCatchMain {

    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}

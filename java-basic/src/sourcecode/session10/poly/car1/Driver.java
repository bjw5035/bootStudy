package sourcecode.session10.poly.car1;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("�ڵ����� �����մϴ�" + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("�ڵ����� �����մϴ�.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }

}

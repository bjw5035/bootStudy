package sourcecode.session10.poly.car1;

public class NewCar implements Car {

    @Override
    public void startEngine() {
        System.out.println("New Car");
    }

    @Override
    public void offEngine() {
        System.out.println("Off Car");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Press Accelerator");
    }
}

package sourcecode.session10.poly.car1;

public class K3Car implements Car {

    @Override
    public void startEngine() {
        System.out.println("K3Car Engine is running");
    }

    @Override
    public void offEngine() {
        System.out.println("K3Car Engine is off");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3Car press Accelerator");
    }
}

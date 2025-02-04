package sourcecode.session10.poly.car1;

public class Model3Car implements Car {

    @Override
    public void startEngine() {
        System.out.println("Model3Car starting engine");
    }

    @Override
    public void offEngine() {
        System.out.println("Model3Car off engine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car press accelerator");
    }
}

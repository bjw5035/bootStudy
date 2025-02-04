package sourcecode.session10.poly.ex6;

public class Bird extends AbstractAnimal implements Fly {

    @Override
    public void sound() {
        System.out.println("±±");
    }

    @Override
    public void fly() {
        System.out.println("�� ����");
    }
}

package sourcecode.session10.poly.ex4;


public class AbstractMain {

    public static void main(String[] args) {
        // �߻�Ŭ���� ���� �Ұ�
        // AbstractAnimal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("���� �Ҹ� �׽�Ʈ ����");
        animal.sound();
        System.out.println("���� �Ҹ� �׽�Ʈ ����");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("���� �̵� �׽�Ʈ ����");
        animal.move();
        System.out.println("���� �̵� �׽�Ʈ ����");
    }

}

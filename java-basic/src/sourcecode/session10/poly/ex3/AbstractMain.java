package sourcecode.session10.poly.ex3;


public class AbstractMain {

    public static void main(String[] args) {
        // �߻�Ŭ���� ���� �Ұ�
        // AbstractAnimal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("���� �Ҹ� �׽�Ʈ ����");
        animal.sound();
        System.out.println("���� �Ҹ� �׽�Ʈ ����");
    }

}

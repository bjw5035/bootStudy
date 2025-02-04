package sourcecode.session10.poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("���� �Ҹ� �׽�Ʈ ����");
        dog.sound();
        System.out.println("���� �Ҹ� �׽�Ʈ ����");

        soundCat(cat);
        soundCaw(caw);
    }

    private static void soundCaw(Caw caw) {
        System.out.println("���� �Ҹ� �׽�Ʈ ����");
        caw.sound();
        System.out.println("���� �Ҹ� �׽�Ʈ ����");
    }

    private static void soundCat(Cat cat) {
        System.out.println("���� �Ҹ� �׽�Ʈ ����");
        cat.sound();
        System.out.println("���� �Ҹ� �׽�Ʈ ����");
    }
}

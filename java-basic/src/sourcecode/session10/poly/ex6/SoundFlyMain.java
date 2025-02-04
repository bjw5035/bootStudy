package sourcecode.session10.poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);
        flyAnimal(bird);
        flyAnimal(chicken);
    }

    //AbstractAnimal ��� ����
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("���� �Ҹ� �׽�Ʈ ����");
        animal.sound();
        System.out.println("���� �Ҹ� �׽�Ʈ ����");
    }
    //Fly �������̽��� ������ ��� ����
    private static void flyAnimal(Fly fly) {
        System.out.println("���� �׽�Ʈ ����");
        fly.fly();
        System.out.println("���� �׽�Ʈ ����");
    }

}

package sourcecode.session10.poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("���� �Ҹ� �׽�Ʈ ����");
        animal.sound();
        System.out.println("���� �Ҹ� �׽�Ʈ ����");
    }

}

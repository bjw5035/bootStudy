package sourcecode.session10.poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        Animal[] animalArr = {dog, cat, caw, duck};

        for (Animal animal : animalArr) {
            System.out.println("���� �Ҹ� �׽�Ʈ ����");
            animal.sound();
            System.out.println("���� �Ҹ� �׽�Ʈ ����");

        }

    }


}

package sourcecode.session10.poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

    }

    // ������ �ʴ� �κ�
    private static void soundAnimal(Animal animal) {
        System.out.println("���� �Ҹ� �׽�Ʈ ����");
        animal.sound();
        System.out.println("���� �Ҹ� �׽�Ʈ ����");
    }


}

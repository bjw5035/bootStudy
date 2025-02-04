package sourcecode.session10.poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 ȣ��");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 ȣ��");
        call(parent2);

    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("Child �ν��Ͻ� ����");
            // ���� 1
//            Child child = (Child) parent;
//            child.childMethod();
            // ���� 2
            ((Child) parent).childMethod();
        } else {
            System.out.println("Child �ν��Ͻ� �ƴ�");
        }

    }

}

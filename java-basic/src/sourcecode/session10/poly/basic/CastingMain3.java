package sourcecode.session10.poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {

        Child child = new Child();
        Parent parent1 = (Parent) child; // ��ĳ������ ���� ����, ���� ����
        Parent parent2 = child; // ��ĳ������ ����

        parent1.parentMethod();
        parent2.parentMethod();
    }

}

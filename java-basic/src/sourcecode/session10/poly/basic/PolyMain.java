package sourcecode.session10.poly.basic;

public class PolyMain {

    public static void main(String[] args) {

        // �θ� ������ �θ� �ν��Ͻ� ����
        System.out.println("Parent -> Parent");
        Parent p = new Parent();
        p.parentMethod();

        // �ڽ� ������ �ڽ� �ν��Ͻ� ����
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // �θ� ������ �ڽ� �ν��Ͻ� ����(������ ����)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        // Child child1 = new Parent(); -> �ڽ��� �θ� ���� �� ����.

        // �ڽ��� ����� ȣ���� �� ����. ������ ����
        // poly.childMethod();
    }

}

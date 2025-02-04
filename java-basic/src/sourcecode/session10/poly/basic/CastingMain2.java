package sourcecode.session10.poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        // �θ� ������ �ڽ� �ν��Ͻ� ����(������ ����)
        Parent poly = new Child(); // x001
        // �� �ڽ��� ����� ȣ���� �� ����. ������ ���� �߻�
        // poly.childMethod();

        // �Ͻ��� �ٿ�ĳ���� - �ش� �޼��带 ȣ���ϴ� ������ �ٿ�ĳ����
        ((Child) poly).childMethod();
    }

}

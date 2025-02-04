package sourcecode.ex;


public class excode1 {

    public static void main(String[] args) {

        Student s1 = createStudent("학생1", 15, 90);
        Student s2 = createStudent("학생1", 15, 90);

        printStudent(s1);
        printStudent(s2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }


    static void printStudent(Student student) {
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.grade);
    }

}

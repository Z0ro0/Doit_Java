package chapter05_4;

public class StudentTest1 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.studentName="최가을";
        System.out.println(s1.getStudentName());

        Student s2 = new Student();
        s2.studentName="하진";
        System.out.println(s2.getStudentName());
    }
}

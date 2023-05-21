package chapter05_4;

public class StudentTest {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.studentName = "최가을";

        System.out.println(s1.studentName);
        System.out.println(s1.getStudentName());
    }
}

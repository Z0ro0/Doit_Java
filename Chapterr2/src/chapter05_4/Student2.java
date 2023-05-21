package chapter05_4;

public class Student2 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.studentName = "최가을";

        Student s2 = new Student();
        s2.studentName="하진";

        System.out.println(s1);//참조 변수 값 출력
        System.out.println(s2);//참조 변수 값 출력
    }
}

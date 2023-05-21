public class StudentTest2 {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.studentName="최가을";

        Student student2 = new Student();
        student2.studentName="하진";

        System.out.println(student1);//참조값(메모리 주소 값) 나옴
        System.out.println(student2);//참조값(메모리 주소 값) 나옴
    }
}

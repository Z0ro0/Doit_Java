public class Student {
    int StudentID;
    String studentName;
    int grade;
    String address;

    public String showStudentInfo(){
        return studentName;
    }

    public static void main(String[] args){
        Student s1 = new Student();
        s1.studentName="최가을";

        System.out.println(s1.studentName);
        System.out.println(s1.showStudentInfo());
    }
}

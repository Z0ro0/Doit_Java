package chapter05_4;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String name){
        studentName = name;
    }

    public static void main(String[] args){
        Student s1 = new Student();
        s1.studentName = "최가을";

        System.out.println(s1.studentName);
        System.out.println(s1.getStudentName());
    }
}

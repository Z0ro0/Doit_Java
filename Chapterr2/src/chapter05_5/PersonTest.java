package chapter05_5;

public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "김유신";
        p1.weight = 85.5F;
        p1.height = 100.0F;

        Person p2 = new Person("이순신", 175, 75);
    }
}

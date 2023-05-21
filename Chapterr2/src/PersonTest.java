public class PersonTest {
    public static void main(String [] args){
        //디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화
        Person persionKim = new Person();
        persionKim.name = "김유신";
        persionKim.weight = 85.5F;
        persionKim.height = 100.0F;

        Person personLee = new Person("이순신", 175, 75);
        //인스턴스 변수 초기화와 동시에 클래스 생성
    }
}

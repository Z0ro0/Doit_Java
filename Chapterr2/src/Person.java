public class Person {
    String name;
    float height;
    float weight;
    
    public Person(){}//디폴트 생성자 직접 추가해 주어야 PersonTest에서 오류 안 남 -> 생성자가 하나도 없는 경우에만 디폴트 생성자를 제공하기 때문에
    public Person(String pname){
        //자바 컴파일러가 자동으로 제공하는 디폴트 생성자, 따로 생성자를 만들지 않아도 자동으로 디폴트 생성자 만들어짐
        name = pname;//이름을 매개변수로 입력받는 생성자
    }
    public Person(String pname, float pheight, float pweight){
        //이름 키 몸무게를 매개변수로 입력받는 생성자
        name = pname;
        height = pheight;
        weight = pweight;
    }
}

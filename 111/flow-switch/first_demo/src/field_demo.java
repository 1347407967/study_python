import java.util.Scanner;

public class field_demo {
    public static void main(String[] args) {
        Person ming=new Person();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入明的出生日期：");
        int i=input.nextInt();

        ming.setBirth(i);
        System.out.println("今年：" + ming.getAge());
        Group group=new Group();
        group.setNames("xaioming");
        
    }
}

class Person{
    private String name;
    private  int birth;
    public Person(){
         
    }

    public Person(String name, int age) {
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }
    public int getAge(){
        return calcAge(2021);
    }

    private int calcAge(int i) {
        return i-this.birth;
    }
}
class Group{
    private String[] names;

    public void setNames(String... names) {
        this.names = names;
    }

    public String[] getNames() {
        return this.names;
    }
    class student extends Person{
        protected int score;
        public student(String name,int age,int score){
            super(name,age);
            this.score=score;
        }
        
    }

}
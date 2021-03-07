import org.w3c.dom.css.Rect;

public class extends_demo {
    public static void main(String[] args) {
        Student s = new Student("Xiao Ming", 12, 89);

        System.out.println(s.toString());
    }
}

        class Persons {
            protected String name;
            protected int age;

            public Persons(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        class Student extends Persons {
            protected int score;

            public Student(String name, int age, int score) {
                super(name,age);
                this.score = score;
            }


}

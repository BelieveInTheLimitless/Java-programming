public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        System.out.println(student1.name);
        System.out.println(student1.roll_no);
        System.out.println(student1.marks);
        student1.greeting();
    }
}

class Student{
    int roll_no;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello "+name);
    }

    Student(){
        this.roll_no = 50;
        this.name = "Vishal";
        this.marks = 85.2f;
    }
}

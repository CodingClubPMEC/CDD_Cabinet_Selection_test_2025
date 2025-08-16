package OOPs;
public class Person {
    private String name;
    private int age;
    public void displayDetails(){
        System.out.println("Name: " + name + "\n" + "Age: " + age);
    }
    void Person() {
        this.name = "Ananya";
        this.age = 20;
    }
    public static void main(String[] args) {
        Student obj = new Student();
    obj.displayDetails();
    }
}
class Student extends Person{
    private int rollNumber;
    private String course;
    public Student() {
        super.Person();
    }
    void Student() {
        this.rollNumber = 101;
        this.course = "B.Tech CSE";
    }

    public void displayDetails(){
        Student();
        super.displayDetails();
        System.out.println("Roll Number: " + rollNumber + "\n" + "Course: " + course);
    }
}


package day7;
class Student{
    int roll;
    String name;
    int age;
    Student(int n,String name){
        System.out.println("object created!");
    }
}

public class Objects {
    public static void main() {
        System.out.println("hello world!");
        Student s1 = new Student(1, "Arivu");
//        s1.roll=1;
//        s1.name="arivu0";
    }
}

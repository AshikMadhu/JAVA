package tutorials;

class Person {

    String name;
    int age;
    String email;
    String address;
    double salary;

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}

class Student extends Person {

    String major;

    void displayMajor() {
        System.out.println("Major: " + major);
    }
}

class Instructor extends Person {

    String subject;

    void displaySubject() {
        System.out.println("Subject: " + subject);
    }
}

public class PersonInheritanceDemo {

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Ashik";
        student.age = 20;
        student.email = "ashik@gmail.com";
        student.address = "Kottayam";
        student.salary = 25000;
        student.major = "Computer Science";

        Instructor instructor = new Instructor();

        instructor.name = "Meoww";
        instructor.age = 35;
        instructor.email = "meow@gmail.com";
        instructor.address = "Kochi";
        instructor.salary = 55000;
        instructor.subject = "Java Programming";

        System.out.println(" STUDENT DETAILS");
        student.displayPersonInfo();
        student.displayMajor();

        System.out.println("\nINSTRUCTOR DETAILS ");
        instructor.displayPersonInfo();
        instructor.displaySubject();
    }
}
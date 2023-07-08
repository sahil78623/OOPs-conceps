class Student {
    // properties or members

    // data members
    String name;
    String age;

    // Non Parameterised Contructor
    Student() {
        System.out.println("Non Parameterised Constructor called");
    }

    // Parameterised Contructor
    Student(String name, String age) {
        System.out.println("Parameterised Constructor called");
        this.name = name;
        this.age = age;
    }

    // copy constructors
    Student(Student s1) {
        System.out.println("Copy Constructor called");
        this.name = s1.name;
        this.age = s1.age;
    }

    public void printInfo() {
        System.out.println("name = " + this.name + " age = " + this.age);
    }
}

public class oops {
    public static void main(String[] args) {
        /*
         * Student() is a speacial type of function which
         * is used to create an object, this special function
         * is called constructor
         * 
         * It can be called only once that is at the time of
         * creating object
         * 
         * There is no return type for constructors
         * 
         * There are 3 types of constuctors
         * 1. Default(Non Parameterised)
         * 1. Non Parameterrised constructor
         * 2. Parameterised constructor
         * 3. Copy Contructors
         * 
         * GARBAGE COLLECTOR
         * we dont write destructors in java because it is 
         * handeled by garbage collector
         */

        Student s1 = new Student();
        s1.name = "Sahil";
        s1.age = "25";
        s1.printInfo();

        // Parameterised constructor
        Student s2 = new Student("sam", "24");

        s2.printInfo();

        // Copy Constructors
        Student s3 = new Student(s1);
        s3.printInfo();
    }
}
public class Student {

    String name;
    int age;
    int marks;


    //  Constructor

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    //  Method 1
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    //  METHOD 2

    public String calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    //  METHOD 3
    public boolean isPassed() {
        if (marks >= 50) {
            return true;
        } else {
            return false;
        }
    }

    //  Method 4
    public static void schoolMotto() {
        System.out.println("Education For Everyone");
    }

    //  Challenge method
    public String compareMarks(Student otherStudent) {
        if (this.marks > otherStudent.marks) {
            return this.name + " has higher marks!";
        } else if (otherStudent.marks > this.marks) {
            return otherStudent.name + " has higher marks!";
        } else {
            return "Both students have equal marks.";
        }
    }
}
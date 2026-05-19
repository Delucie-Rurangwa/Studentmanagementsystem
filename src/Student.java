 public class Student {
        // --- Declaring  VARIABLES---
        String name;
        int age;
        int marks;


        // --- CONSTRUCTOR ---
        // Initializes the variables whenever a new student object is created.
        public Student(String name, int age, int marks) {
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        // --- METHOD 1: displayStudentInfo() ---
        // A void method (no return type) that displays student details[cite: 9, 30].
        public void displayStudentInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Marks: " + marks);
        }

        // --- METHOD 2: calculateGrade() ---
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

        // --- METHOD 3: isPassed() ---
        // Returns true if marks are 50 or higher, otherwise false[cite: 32].
        public boolean isPassed() {
            if (marks >= 50) {
                return true;
            } else {
                return false;
            }
        }

        // --- METHOD 4: schoolMotto() (STATIC) ---
        // Belongs to the class itself. Prints the required statement
        public static void schoolMotto() {
            System.out.println("Education For Everyone");
        }

        // --- CHALLENGE METHOD: compareMarks() ---
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

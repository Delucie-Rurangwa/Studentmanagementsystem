public class Main {
    public static void main(String[] args) {

        // call school  motto method
        Student.schoolMotto();
        System.out.println("---------------------------------");


        // Creating  two student objects
        Student student1 = new Student("Zuba", 19, 75);
        Student student2 = new Student("Ntare", 20, 45);

        //  Testing all methods for Student 1
        System.out.println("--- Student 1 Details ---");
        student1.displayStudentInfo();
        System.out.println("Grade: " + student1.calculateGrade());
        System.out.println("Passed? " + student1.isPassed());
        System.out.println();

        // Testing all methods for Student 2
        System.out.println("--- Student 2 Details ---");
        student2.displayStudentInfo();
        System.out.println("Grade: " + student2.calculateGrade());
        System.out.println("Passed? " + student2.isPassed());
        System.out.println();

        // Increasing marks

        int bonusMarks = 10;

        System.out.println("--- Applying Bonus Marks to " + student2.name + " ---");
        student2.marks = student2.marks + bonusMarks; // Increasing the marks
        System.out.println("Updated Marks: " + student2.marks);
        System.out.println("Updated Grade: " + student2.calculateGrade());
        System.out.println();

        // Comparing the marks of the two students
        System.out.println("--- Comparing Marks ---");
        String higherStudent = student1.compareMarks(student2);
        System.out.println(higherStudent);
        System.out.println();

    }
}
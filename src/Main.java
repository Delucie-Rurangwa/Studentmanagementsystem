public class Main {
    public static void main(String[] args) {

        // 1. Call the static method using the Class name [cite: 34]
        Student.schoolMotto();
        System.out.println("---------------------------------");

        // 2. Create a local variable named bonusMarks [cite: 35]
        int bonusMarks = 10;

        // 3. Create at least two student objects [cite: 37]
        Student student1 = new Student("Beza", 19, 75);
        Student student2 = new Student("Kaze", 20, 45);

        // 4. Test all methods for Student 1 [cite: 37, 38]
        System.out.println("--- Student 1 Details ---");
        student1.displayStudentInfo();
        System.out.println("Grade: " + student1.calculateGrade());
        System.out.println("Passed? " + student1.isPassed());
        System.out.println();

        // 5. Test all methods for Student 2 [cite: 37, 38]
        System.out.println("--- Student 2 Details ---");
        student2.displayStudentInfo();
        System.out.println("Grade: " + student2.calculateGrade());
        System.out.println("Passed? " + student2.isPassed());
        System.out.println();

        // 6. Use the local variable bonusMarks to increase Student 2's marks
        System.out.println("--- Applying Bonus Marks to " + student2.name + " ---");
        student2.marks = student2.marks + bonusMarks; // Increasing the marks
        System.out.println("Updated Marks: " + student2.marks);
        System.out.println("Updated Grade: " + student2.calculateGrade());
        System.out.println();

        // 7. Additional Challenge: Compare the marks of the two students
        System.out.println("--- Comparing Marks ---");
        String higherStudent = student1.compareMarks(student2);
        System.out.println(higherStudent);
        System.out.println();

        // 8. Display global enrollment tracker
        System.out.println("Total Students Created: " + Student.totalEnrolled);
    }
}
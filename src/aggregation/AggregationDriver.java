package aggregation;

public class AggregationDriver {

    public static void main(String[] args) {
        Instructor nimaDavarpanah = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor daveJohannsen = new Instructor("Dave", "Johannsen", "1-2345");

        Textbook cleanCode = new Textbook("Clean Code", "Robert C. Martin", "Pearson");
        Textbook comArchitecture = new Textbook("Computer Architecture, A Quantitative Approach", "John L. Hennessy", "Morgan Kaufmann");

        // First course with 1 instructor and 1 textbook
        Course advancedSwe = new Course("Advanced Software Engineering");
        advancedSwe.addInstructor(nimaDavarpanah);
        advancedSwe.addTextbook(cleanCode);

        // Second course with 2 instructors and 2 textbooks
        Course advancedSweCompArc = new Course("Advanced Software Engineering and Computer Architecture");
        advancedSweCompArc.addInstructor(nimaDavarpanah);
        advancedSweCompArc.addInstructor(daveJohannsen);
        advancedSweCompArc.addTextbook(cleanCode);
        advancedSweCompArc.addTextbook(comArchitecture);

        advancedSwe.print();
        System.out.println("\n");
        advancedSweCompArc.print();

    }

}

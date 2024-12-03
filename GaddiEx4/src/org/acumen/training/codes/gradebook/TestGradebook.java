package org.acumen.training.codes.gradebook;

public class TestGradebook {

    public static void main(String[] args) {
    	
        Gradebook gbook = new Gradebook();

        gbook.addGrade(85.0);
        gbook.addGrade(90.5);
        gbook.addGrade(78.2);
        gbook.addGrade(92.0);
        gbook.addGrade(88.3);
        gbook.addGrade(74.6);
        gbook.addGrade(95.1);
        gbook.addGrade(83.7);
        gbook.addGrade(90.5);
        gbook.addGrade(91.4);

        System.out.print("All grades:\t");
        gbook.printGrades();

        System.out.println("Average grade:\t" + gbook.computeAve());

        gbook.deleteGrade(90.5);
        gbook.deleteGrade(88.3);
        gbook.deleteGrade(74.6);
        gbook.deleteGrade(83.7);
        gbook.deleteGrade(91.4);

        System.out.print("After deletion:\t");
        gbook.printGrades();

        gbook.deleteGrade(99.9);
        System.out.println();
    }
}

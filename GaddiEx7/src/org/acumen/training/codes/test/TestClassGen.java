package org.acumen.training.codes.test;

import org.acumen.training.codes.ClassRecordGenerator;

public class TestClassGen {

    public static void main(String[] args) {

        String filename = "./src/files/sem-1-2021.txt";
        ClassRecordGenerator generator = new ClassRecordGenerator();
        generator.createRecords(filename);
        
        String highestScorer = generator.queryHighestAverage(filename);
        System.out.println("Student(s) with the highest average: %s".formatted(highestScorer));
    }
}

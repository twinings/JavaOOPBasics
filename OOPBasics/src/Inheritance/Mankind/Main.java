package Inheritance.Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] studentLine = reader.readLine().split(" ");
            String[] workerLine = reader.readLine().split(" ");
            Student student = new Student(studentLine[0],studentLine[1],studentLine[2]);
            Worker worker = new Worker(workerLine[0],workerLine[1],Double.parseDouble(workerLine[2]),Double.parseDouble(workerLine[3]));
            System.out.println(student);
            System.out.println();
            System.out.println(worker);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());

        }
    }
}

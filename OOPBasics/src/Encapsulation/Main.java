package Encapsulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double length = Double.parseDouble(reader.readLine());
        double weigth = Double.parseDouble(reader.readLine());
        double heigth = Double.parseDouble(reader.readLine());
        Box box ;
        try {
            box = new Box(length, weigth, heigth);
        }catch (IllegalArgumentException exp){
            exp.getMessage();
            return;
        }
        System.out.println(String.format("Surface Area - %.2f", box.getSurfaceArea()));
        System.out.println(String.format("Lateral Surface Area - %.2f", box.getLateralSurfaceArea()));
        System.out.println(String.format("Volume - %.2f", box.getVolume()));

    }
}

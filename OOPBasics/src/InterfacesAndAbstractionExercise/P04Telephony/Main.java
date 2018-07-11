package InterfacesAndAbstractionExercise.P04Telephony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<String> nums = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayList::new));
        List<String> links = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayList::new));
        Smartphone smartphone =new Smartphone();
smartphone.addNumber(nums);
smartphone.addSite(links);
        System.out.print(smartphone.calling());
        System.out.print(smartphone.browsing());
    }
}

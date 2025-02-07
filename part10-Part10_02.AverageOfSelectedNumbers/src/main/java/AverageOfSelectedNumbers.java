
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type " + "end " + "to stop.");
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            inputs.add(input);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String printOption = scanner.nextLine();
        
        if (printOption.equals("n")){
            double averageOfNegativeNumbers = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(s -> s <= 0)
            .average()
            .getAsDouble();
            System.out.println("Average of the negative numbers: " + averageOfNegativeNumbers);
        }else if (printOption.equals("p")){
            double averageOfPositiveNumbers = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(s -> s >= 0)
            .average()
            .getAsDouble();
            System.out.println("Average of the positive numbers: " + averageOfPositiveNumbers);
        }   
    }
}

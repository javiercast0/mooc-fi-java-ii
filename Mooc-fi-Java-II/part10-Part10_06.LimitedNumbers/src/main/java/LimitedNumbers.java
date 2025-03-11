
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userInputs = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input < 0){
                break;
            }
            userInputs.add(input);
        }
        
        userInputs.stream()
                .filter(value -> value >=1 && value <= 5)
                .forEach(input -> System.out.println(input));
        
    }
}

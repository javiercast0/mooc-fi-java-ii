import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        this.random = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        while (this.numbers.size() < 7) {
            int numberToAdd = random.nextInt(40) + 1;
            if (!this.numbers.contains(numberToAdd)) {
                this.numbers.add(numberToAdd);
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}


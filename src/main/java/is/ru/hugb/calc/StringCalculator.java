package is.ru.hugb.calc;

import java.util.stream.Stream;

public class StringCalculator {
	// Adds together an input of integers.
    public int add(String input) {
        int sum = 0;
        if (input.equals("")) {
            return 0;
        }
        else if (input.contains(",")) {
            Integer[] numbers = Stream.of(input.split(",|\\n"))
                .map(Integer::valueOf).toArray(Integer[]::new);
            for (int number : numbers) {
                sum += number;
            }
            return sum;
        }
		
		// Returns the results
        return Integer.parseInt(input);
    }
}

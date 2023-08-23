public class ArrayIntrodution {
    public static void main(String[] args) {

        // Task 1
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println("Task 1");
        printArray(numbers);

        // Task 2
        System.out.println("Task 2");
        System.out.println(ArraySum(numbers) + "\n");

        // Task 3
        System.out.println("Task 3");
        System.out.println(highestNumber(numbers) + "\n");

        // Task 4
        int[] numbersHigh = new int[10];
        for(int i = 0; i < numbersHigh.length; i++) {
            numbersHigh[i] = i + 11;
        }

        // Task 5
        System.out.println("Task 5");
        int[] numbersAddition = new int [10];
        for(int i = 0; i < numbers.length; i++) {
            numbersAddition[i] = numbers[i] + numbersHigh[i];
        }
        printArray((numbersAddition));

    }

    public static int ArraySum(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }
    
    public static int highestNumber(int[] numbers) {
        int maximum = Integer.MIN_VALUE;
        for(int number : numbers) {
            if(number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }

    public static void printArray(int[] numbers) {
        for(int number : numbers) {
            System.out.println(number);
        }
        System.out.println();
    }
}

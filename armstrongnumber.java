
public class armstrongnumber {
    public static void main(String[] args) {
        int lower = 1;
        int upper = 500;

        System.out.println("Armstrong numbers between " + lower + " and " + upper + ":");
        printArmstrongNumbers(lower, upper);
    }

    public static void printArmstrongNumbers(int lower, int upper) {
        for (int number = lower; number <= upper; number++) {
            int sum = 0;
            int temp = number;
            int digits = String.valueOf(number).length();

            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == number) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}


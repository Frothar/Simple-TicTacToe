import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int sum = 0;

        for (int greaterThan : numbers) {
            if (greaterThan > n) {
                sum += greaterThan;
            }
        }

        System.out.println(sum);
    }
}
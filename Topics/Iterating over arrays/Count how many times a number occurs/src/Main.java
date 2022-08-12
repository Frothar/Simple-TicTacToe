import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int counter = 0;
        int number = scanner.nextInt();

        for (int i : array) {
            if (i == number) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
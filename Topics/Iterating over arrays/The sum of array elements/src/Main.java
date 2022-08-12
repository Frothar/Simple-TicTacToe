import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] array = new int[length];
        int sum = 0;

        for (int i = 0; i < length; i++) {
            if (scanner.hasNext()) {
                array[i] = scanner.nextInt();
                sum += array[i];
            }
        }

        System.out.println(sum);
    }
}
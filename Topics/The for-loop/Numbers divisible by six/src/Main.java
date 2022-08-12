import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array =  new int[size];
        int sum = 0;
        final int six = 6;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % six == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
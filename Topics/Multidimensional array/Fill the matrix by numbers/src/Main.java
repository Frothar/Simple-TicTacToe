import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        final int oneHundred = 100;

        if (input > oneHundred) {
            System.out.println("Wrong number!\n Input must be less than 100!");
        } else {
            int[][] matrix =  new int[input][input];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = Math.abs(i - j);
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

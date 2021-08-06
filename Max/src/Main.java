import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập kích thước cột : ");
            int arrayLengthRow = scanner.nextInt();
            System.out.println("Nhập kích thước hàng : ");
            int arrayLengthColumm = scanner.nextInt();
            double[][] array = createArray(arrayLengthRow, arrayLengthColumm);
            for (int i = 0; i < arrayLengthRow; i++) {
                for (int j = 0; j < arrayLengthColumm; j++) {
                    System.out.print("Nhập giá trị tại  " + i + " " + j + " :");
                    array[i][j] = scanner.nextDouble();
                }
            }
            System.out.println("Giá trị lớn nhất là : " + searchMax(array));
            break;
        }
    }

    public static double searchMax(double[][] array) {
        double max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static double[][] createArray(int arrayLengthRow, int arrayLengthColumm) {
        double[][] array = new double[arrayLengthRow][arrayLengthColumm];
        return array;
    }
}

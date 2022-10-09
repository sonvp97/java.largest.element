import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        double element;
        int index1 = 0;
        int index2 = 0;
        double[][] arr = new double[size][];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d element how many elements do you want to have ",i);
            size = scanner.nextInt();
            arr[i] = new double[size];
        }
        double max = arr[0][0];
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.printf("Enter element arr[%d][%d] = ",i,j);
                element = scanner.nextDouble();
                arr[i][j] = element;
                if (arr[i][j] > max){
                    max = arr[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("The largest value is: " + max + " position number " + index1 + " and element number " + index2);
    }
}

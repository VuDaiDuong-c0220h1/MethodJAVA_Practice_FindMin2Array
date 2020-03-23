import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kích thước phần tử mảng thứ nhất: ");
        int firstSize = sc.nextInt();
        System.out.println("Kích thước phần tử mảng thứ hai: ");
        int secondSize = sc.nextInt();
        int [][]array = new int[firstSize][secondSize];
        for (int i = 0; i < array.length; i++){
            for(int j= 0; j < array[i].length; j++) {
                System.out.println("Nhập phần tử thứ " + (j+1) + " của mảng thứ " + (i+1));
                array[i][j] = sc.nextInt();
            }
        }
        int min = array[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Phần tử nhỏ nhất là: "
                + min + " ở vị trí hàng " + (x+1) + " cột " + (y+1));
    }
}

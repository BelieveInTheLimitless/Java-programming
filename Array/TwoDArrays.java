import java.util.Scanner;

public class TwoDArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int numbers[][] = new int [row][col];

        for (int i = 0; i< row; i++){
            for(int j = 0; j < col; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nEnter the number you want to search : ");
        int x = sc.nextInt();

        for (int i = 0; i< row; i++){
            for(int j = 0; j < col; j++){
                if(numbers[i][j] == x)
                    System.out.print("Element is found at row "+ i +" and column "+ j);
            }
        }
    }
}

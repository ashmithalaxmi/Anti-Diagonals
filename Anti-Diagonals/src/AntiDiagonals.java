import java.util.Scanner;

public class AntiDiagonals {
    static void antiDiagonal(int[][] A, int row, int col){
        for(int x=0;x<row;x++){
            int i=0;
            int j=x;
            while(i<row) {
                if (j >= 0) {
                    System.out.print(A[i][j]+" ");
                } else {
                    System.out.print("0"+" ");
                }
                i++;
                j--;
            }
            System.out.println();
        }
        for(int y=0;y<col;y++) {
            int i = y;
            int j = col - 1;
            while (j >= 0) {
                if (i < row) {
                    System.out.print(A[i][j]+" ");
                } else {
                    System.out.print("0" + " ");
                }
                i++;
                j--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] A = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        antiDiagonal(A, row, col);
    }
}

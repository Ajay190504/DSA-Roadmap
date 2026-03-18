import java.util.Scanner;

public class Int2DArray {
    public static void main(String[] args) {

        int[][] staticArr = {
                {1,2,3},
                {4,5,6}
        };

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] dynamicArr = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                dynamicArr[i][j] = sc.nextInt();
            }
        }
    }
}
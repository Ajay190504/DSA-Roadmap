import java.util.Scanner;

public class Long2DArray {
    public static void main(String[] args) {

        long[][] staticArr = {
                {1000L,2000L},
                {3000L,4000L}
        };

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        long[][] dynamicArr = new long[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                dynamicArr[i][j] = sc.nextLong();
            }
        }
    }
}
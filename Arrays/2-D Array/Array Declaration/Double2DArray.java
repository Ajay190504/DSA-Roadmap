import java.util.Scanner;

public class Double2DArray {
    public static void main(String[] args) {

        double[][] staticArr = {
                {1.1,2.2},
                {3.3,4.4}
        };

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        double[][] dynamicArr = new double[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                dynamicArr[i][j] = sc.nextDouble();
            }
        }
    }
}
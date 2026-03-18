import java.util.Scanner;

public class Float2DArray {
    public static void main(String[] args) {

        float[][] staticArr = {
                {1.2f,2.3f},
                {3.4f,4.5f}
        };

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        float[][] dynamicArr = new float[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                dynamicArr[i][j] = sc.nextFloat();
            }
        }
    }
}
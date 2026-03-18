import java.util.Scanner;

public class Short2DArray {
    public static void main(String[] args) {

        short[][] staticArr = {
                {10,20},
                {30,40}
        };

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        short[][] dynamicArr = new short[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                dynamicArr[i][j] = sc.nextShort();
            }
        }
    }
}
import java.util.Scanner;

public class Boolean2DArray {
    public static void main(String[] args) {

        boolean[][] staticArr = {
                {true,false},
                {false,true}
        };

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        boolean[][] dynamicArr = new boolean[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                dynamicArr[i][j] = sc.nextBoolean();
            }
        }
    }
}
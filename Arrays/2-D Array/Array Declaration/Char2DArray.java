import java.util.Scanner;

public class Char2DArray {
    public static void main(String[] args) {

        char[][] staticArr = {
                {'A','B'},
                {'C','D'}
        };

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        char[][] dynamicArr = new char[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                dynamicArr[i][j] = sc.next().charAt(0);
            }
        }
    }
}
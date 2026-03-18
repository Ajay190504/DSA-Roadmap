import java.util.Scanner;

public class Byte2DArray {
    public static void main(String[] args) {

        // Static initialization
        byte[][] staticArr = {
                {1,2,3},
                {4,5,6}
        };

        // Dynamic initialization using Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        byte[][] dynamicArr = new byte[r][c];

        System.out.println("Enter elements:");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                dynamicArr[i][j] = sc.nextByte();
            }
        }
    }
}
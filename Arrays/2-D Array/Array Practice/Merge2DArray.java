public class Merge2DArray {
    public static void main(String[] args) {

        int[][] a = {
                {1,2},
                {3,4}
        };

        int[][] b = {
                {5,6},
                {7,8}
        };

        int[][] merge = new int[4][2];

        int index=0;

        for(int i=0;i<a.length;i++)
            merge[index++] = a[i];

        for(int i=0;i<b.length;i++)
            merge[index++] = b[i];

        for(int i=0;i<merge.length;i++){
            for(int j=0;j<merge[i].length;j++){
                System.out.print(merge[i][j]+" ");
            }
            System.out.println();
        }
    }
}
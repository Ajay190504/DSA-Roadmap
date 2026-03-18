public class Min2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {5,9,3},
                {8,2,7}
        };

        int min = arr[0][0];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] < min)
                    min = arr[i][j];
            }
        }

        System.out.println("Min = " + min);
    }
}
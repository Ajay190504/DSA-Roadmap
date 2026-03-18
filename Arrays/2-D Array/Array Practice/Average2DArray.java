public class Average2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {2,4,6},
                {8,10,12}
        };

        int sum = 0;
        int count = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum += arr[i][j];
                count++;
            }
        }

        double avg = (double)sum/count;

        System.out.println("Average = " + avg);
    }
}
public class SecondLargest2D {
    public static void main(String[] args) {

        int[][] arr = {
                {5,8,3},
                {9,1,7}
        };

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                int num = arr[i][j];

                if(num > first){
                    second = first;
                    first = num;
                }
                else if(num > second && num != first){
                    second = num;
                }

            }
        }

        System.out.println("Second Largest = "+second);
    }
}
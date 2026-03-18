public class Search2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };

        int key = 5;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                if(arr[i][j] == key){
                    System.out.println("Found at "+i+","+j);
                    return;
                }

            }
        }

        System.out.println("Element not found");
    }
}
public class RemoveDuplicates2D {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,2},
                {3,1,4}
        };

        int[] temp = new int[6];
        int size = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                int val = arr[i][j];
                boolean found=false;

                for(int k=0;k<size;k++){
                    if(temp[k]==val){
                        found=true;
                        break;
                    }
                }

                if(!found){
                    temp[size++] = val;
                }

            }
        }

        for(int i=0;i<size;i++)
            System.out.print(temp[i]+" ");
    }
}
public class Freq2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,2},
                {3,1,2}
        };

        int[] temp = new int[6];
        int k=0;

        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
                temp[k++] = arr[i][j];

        for(int i=0;i<temp.length;i++){

            int count=1;

            if(temp[i]==-1)
                continue;

            for(int j=i+1;j<temp.length;j++){

                if(temp[i]==temp[j]){
                    count++;
                    temp[j] = -1;
                }

            }

            System.out.println(temp[i]+" : "+count);
        }
    }
}
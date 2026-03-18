public class SortedSquares{

   public static int[] sortedSquares(int num[]){
      int squared[] = new int[num.length];
      int left = 0;
      int right = num.length-1;
      int k = num.length-1;

      while(left<=right){
         if(Math.abs(num[left])>Math.abs(num[right])){
            squared[k]=num[left]*num[left];
            left++;
            k--;
         }
         else{
            squared[k]=num[right]*num[right];
            right--;
            k--;
         }
      }
      return squared;
   }
   public static void main(String[] args) {
      int num[] = {-4,-1,0,3,10};
      int result[] = sortedSquares(num);

      for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
      }
   }
}
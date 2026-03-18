public class EvenOddCount {
    public static void main(String[] args) {

        int[] arr = {10,15,20,25,30};

        int even = 0, odd = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);
    }
}
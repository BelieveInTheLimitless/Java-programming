public class KadanesAlgo {
    public static void main(String[] args) {
        int arr[] = {2 ,4, -3, 5, 4};

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < arr.length; i++){

            currSum += arr[i];

            if(maxSum < currSum){
                maxSum = currSum;
            }

            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println("Sum of maximun sub-array is "+maxSum);    
    }
}

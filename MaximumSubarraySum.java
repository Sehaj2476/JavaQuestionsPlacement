import java.util.Scanner;

public class MaximumSubarraySum {
    public static int maxSubarraySum(int arr[]){
        int currSum = arr[0];
        int maxSum = arr[0];
        for(int i=1;i<arr.length;i++){
            currSum = Math.max(arr[i],arr[i]+currSum);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubarraySum(arr));
    }
}

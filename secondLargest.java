import java.util.Scanner;

public class secondLargest{
    public static int findSecondLargest(int[] arr,int n){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
       
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest = arr[i];
            }
        }
         if(secondLargest == Integer.MIN_VALUE){
            System.out.println("No second largest element exists");
            System.exit(0); 
        }
        return secondLargest;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = findSecondLargest(arr, n);
        System.out.println(ans);
    }
}
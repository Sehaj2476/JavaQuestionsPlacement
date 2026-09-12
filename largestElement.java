import java.util.Scanner;

public class largestElement{
    public static int GreatElement(int[] arr,int n){
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] =  sc.nextInt();
        }
        int ans = GreatElement(arr,n);
        System.out.println("Greatest Element is: ");
        System.out.println(ans);
    }
}
//check if array is sorted
import java.util.*;
public class CheckSorted{
    public static boolean sortedOrNot(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                continue;
            }
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sortedOrNot(arr, n));
    }
}
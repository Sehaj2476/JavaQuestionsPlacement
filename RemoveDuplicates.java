// remove duplicates from sorted array
import java.util.*;
public class RemoveDuplicates {
    public static HashSet<Integer> removalDuplicates(int arr[], int n){
        HashSet <Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(arr[i]);
        }
        return s;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(removalDuplicates(arr, n));
    }
}

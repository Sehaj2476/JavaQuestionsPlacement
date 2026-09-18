import java.util.HashMap;
import java.util.Scanner;

public class DuplicateNumber {
    public static int duplicateValue(int arr[], int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(duplicateValue(arr,n));
    }
}

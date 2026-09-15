import java.util.HashMap;
import java.util.Scanner;

public class CountFrequency {
    public static HashMap<Integer, Integer> freqCount(int arr[], int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);   
        }
        return map;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(freqCount(arr, n));
    }
}

import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class TwoSum{
    public static int[] sum(int arr[], int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num2 = target - arr[i];
            if(map.containsKey(num2)){
                return new int[]{i,map.get(num2)};
            }
            map.put(arr[i],i);
        }
        return new int[0];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements you want in array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter value of target: ");
        int target = sc.nextInt();
        System.out.println("Enter elements in array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(sum(arr,target)));
    }
    
}
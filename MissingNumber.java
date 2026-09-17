import java.util.*;
public class MissingNumber{
    public static int MissingDigit(int arr[]){
		Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(MissingDigit(arr));
        
    }
}
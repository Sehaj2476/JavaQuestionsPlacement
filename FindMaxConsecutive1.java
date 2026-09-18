import java.util.Scanner;

public class FindMaxConsecutive1 {
    public static int MaxConsOne(int arr[]){
        int count = 0;
        int maxCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxCount = Math.max(maxCount,count);
            }
            else{
                count = 0;
            }
        }
        return maxCount;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(MaxConsOne(arr));
    }
}

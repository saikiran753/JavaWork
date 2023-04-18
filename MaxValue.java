import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {2,4,56,33,25,48,53,100};
        System.out.println(maxVal(arr));
        System.out.println(maxRange(arr, 1, 3));
    }

    static int maxVal(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int maxRange(int[] arr, int start, int end){
        int max = arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
        return max;
    }
    
    
}

import java.util.Arrays;

public class containsduplicates {
    public static boolean containdup(int arr[]){
        int n= arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main (String args[]){
        int arr[]= {1,2,3,4,5};
        System.out.println(containdup(arr));
    }
}

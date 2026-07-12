public class largest_num {
    public static int largestnum(int num[]){
    int largest= Integer.MIN_VALUE;
    for(int i=0; i<num.length; i++){
        if(largest<num[i]){
            largest= num[i];
        }
    }
    return largest;
    }

public static void main(String args[]){
    int arr[]={5,2,6,9,1};
    System.out.println("largest number is: "+largestnum(arr));
}

}
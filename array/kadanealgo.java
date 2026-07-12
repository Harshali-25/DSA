public class kadanealgo {
    public static int kadane(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length; i++){
            currsum+=arr[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(maxsum, currsum);
        }
        return maxsum;
    }

     public static void main(String args[]){
    int arr[]={1,-2,6,-1,3};
    System.out.println("maxsubarray sum is: "+kadane(arr));
}
}

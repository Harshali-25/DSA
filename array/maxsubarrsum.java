public class maxsubarrsum {

    //brute approach O(n^3)
    public static int maxsubSum(int arr[]){
        int currsum=0;
        int maxsum= Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            int start=i;
            for(int j=0; j<arr.length; j++){
                int end=j;
                currsum=0;
                for(int k=start; k<=end; k++){
                    currsum+=arr[k];
                    if(currsum>maxsum){
                        maxsum=currsum;
                    }
                }
            }
        }
        return maxsum;
    }


    //better approch using prefix sum O(n^2)
    public static int prefixSum(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0; i<arr.length; i++){
            int st=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                currsum=st==0?prefix[end]:prefix[end]-prefix[st-1];

                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
        }
        return maxsum;
    }

    public static void main(String args[]){
    int arr[]={1,-2,6,-1,3};
    System.out.println("max sum of subarray is: " +prefixSum(arr));
}
}

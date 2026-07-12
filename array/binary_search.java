public class binary_search {
    public static int binarysearch(int arr[], int key){
         int st=0;
         int end=arr.length-1;
         while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                st=mid+1;
            }else{
                end=mid-1;
            }
         }
         return -1;
    } 

public static void main(String args[]){
    int arr[]={5,2,6,9,1};
    int key=9;
    System.out.println("at index"+binarysearch(arr, key));
}
}

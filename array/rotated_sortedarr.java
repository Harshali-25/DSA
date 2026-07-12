public class rotated_sortedarr {
    public static int searchsort(int arr[], int target){
        int st=0;
        int end=arr.length;

        while(st<end){
            int mid= st+(end-st)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[st]<=arr[mid]){
                if(target>=arr[st] && target<=arr[mid]){
                    end=mid;
                }else{
                    st=mid+1;
                }
            }else{
                if(target>=arr[mid+1] && target<=arr[end]){
                    st=mid+1;
                }else{
                    end=mid;
                }
            }
        }
        return -1;
    }

     public static void main (String args[]){
        int arr[]= {4,5,6,7,0,1,2};
        int target=0;
        System.out.println(searchsort(arr, target));
}
}

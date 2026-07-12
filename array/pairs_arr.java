public class pairs_arr {
    public static void pairsarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr=arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+curr+ "," +arr[j]+ ")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
    int arr[]={5,2,6,9,1};
    pairsarr(arr);
}
}

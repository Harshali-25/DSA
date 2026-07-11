import java.util.*;
public class sorting{

    //bubble sort

    public static void bubblesort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j+1]>arr[j]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }


    //selection sort

    public static void selectionsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int largest= i;
            for(int j=i+1; j<arr.length; j++){
            if(arr[largest] < arr[j]){
                largest=j;
            }
        }
            int temp=arr[largest];
            arr[largest]= arr[i];
            arr[i]= temp;
        }
    }


    //inserting sort

    public static void insertionsort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr= arr[i];
            int prev= i-1;
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1]= arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    //countingsort

     public static void countingsort(int arr[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest= Math.max(largest, arr[i]);
        }

        int count[]= new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int k=0;
        for(int i=count.length-1; i>=0; i--){
            for(int j=0; j<count[i]; j++){
                arr[k++]=i;
            }
        }
     }

    public static void main(String[] args) {
        int arr[]= {3,6,2,1,8,7,4,5,3,1};
        countingsort(arr);
        printarr(arr);
    }
}
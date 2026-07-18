import java.util.*;

public class maxAreaHistogram {

    public static void maxArea(int arr[]){

        int maxArea= 0;
        int nsr[]= new int[arr.length];
        int nsl[]=new int[arr.length];

        //next smaller right
        Stack<Integer> s= new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }


        //next smaller left
        s= new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }


        //current area : height * width
        //width=j-i-1 => nsr[i]-nsl[i]-1

        for(int i=0; i<arr.length; i++){
            int width= nsr[i]-nsl[i]-1;

            int currArea= arr[i]*width;
            maxArea=Math.max(maxArea, currArea);
        }
        System.out.println("max area="+maxArea);
    }
    public static void main(String args[]){
        int heights[]={2,1,5,6,2,3};
        maxArea(heights);
}
}

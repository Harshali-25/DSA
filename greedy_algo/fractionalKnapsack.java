package greedy_algo;

import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapsack {
    
    public static void main(String args[]){
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;

        double ratio[][]=new double[val.length][2];
        for(int i=0; i<val.length; i++){
            //0th col=> idx, 1st col=> ratio
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }

        //asc order sort
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int capacity= W;
        int finalvalue=0;

        //we need descending order so we go back to front
        for(int i=ratio.length-1; i>=0; i--){
            int idx= (int)ratio[i][0];
            if(capacity>=weight[idx]){
                //full item include
                capacity-=weight[idx];
                finalvalue+=val[idx];
            }else{
                //fractional item include
                finalvalue+=ratio[i][1]*capacity;
                capacity=0;
                break;
            }
        }
System.err.println("max value get: "+finalvalue);
    }
}

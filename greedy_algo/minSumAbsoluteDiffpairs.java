package greedy_algo;

import java.util.Arrays;
import java.util.Comparator;

public class minSumAbsoluteDiffpairs {
    
    public static void main(String args[]){
        int A[]= {1,2,3};
        int B[]={2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int sum=0;
        for(int i=0; i<A.length; i++){
            int mindiff=Math.abs(A[i]-B[i]);
            sum+=mindiff;
        }
        System.out.println("min difference:" +sum);
    }
}

import java.util.*;
public class activitySelection {

    public static void maxactivity(int start[], int end[]){
        //initalize maxAct
        int maxAct=0;
        ArrayList<Integer> ans = new ArrayList<>();

        //always take a first activity because it gives a most minimum time (end time is sorted so 1st number is smallest number in entire end of arr)
        maxAct=1;  //now maxact will be 1
        ans.add(0); // ativity 0 is add in ans arr

        int lastEnd= end[0];  // we need to store the end time of last activity so the next activity not overlaps with the time


        for(int i=1; i<end.length; i++){
            if(start[i]>=lastEnd){  //next chose activity is always greter time than last ending time (for not overlapping)
               //activity selection
                maxAct++;  // if found +1 maxAct
                ans.add(i); // add in ans arr 
                lastEnd=end[i]; //change the lastEnd also 
            }
        }
        System.out.println("max activities= "+maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.println("A"+ans.get(i)+ " ");
        }
    }

    public static void main(String args[]) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        maxactivity(start, end );
    }

}
import java.util.*;

public class firstNonRepetingletter {
    
    public static void nonrepeatletter(String str){

        Queue<Character> q= new LinkedList<>();
        int[] freq = new int[26]; //a to z

        for(int i=0; i<str.length(); i++){

            char curr= str.charAt(i);
            q.add(curr);
                freq[curr-'a']++;

                while(!q.isEmpty() && freq[q.peek()-'a']>1){
                    q.remove();
                }

                if(q.isEmpty()){
                    System.out.print(-1+" ");
                }else{
                    System.out.print(q.peek()+" ");
                }
        }
        System.out.println();
    }

    public static void main(String args[]){
        String str= "aabccxb";

        nonrepeatletter(str);
    }
}

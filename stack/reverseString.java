import java .util.*;

public class reverseString {
    public static String revStr(String str){
        Stack<Character>s = new Stack<>();

        int i=0;
        while(i <str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder sb= new StringBuilder("");
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }

    public static void main(String args[]){

        String str= "abc";
        System.out.println(revStr(str));
    }
}

import java.util.*;


public class duplicateParentheses {

    public static boolean isValid(String strs){
        Stack<Character> s= new Stack<>();

        for(int i=0; i<strs.length(); i++){
            char ch= strs.charAt(i);
            //closing
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; //duplicate exists;
                }else{
                    s.pop();
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;

    }
       
    public static void main(String args[]){
        //String is always valid
        String str1= "((a+b))"; //true
        String str2= "(a-c)";  //false

        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
    }
}
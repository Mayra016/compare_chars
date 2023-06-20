import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        System.out.println(solution("Hola", "abcsde"));
    }
      // receive to parameters and compare if the second is the endind of the first return a boolean

    static boolean solution(String str, String ending) {
        boolean result = true;
        int chars = str.length() - ending.length();
        int i = 0;
        int iterations = str.length() - 1;
        if (ending == ""){
                result = true;
               
        }
        else if (ending.length() > str.length()){
                result = false;
              
        }
        else {
            while (chars <= iterations) {
                char letter = str.charAt(chars);
                char letterEnding = ending.charAt(i);
                
                
                
                if (result) {
                    if (str.toUpperCase().charAt(chars) == ending.toUpperCase().charAt(i)){
                    result = true;
                    }
                    
                    else{
                        result = false;
                    }
                    chars = chars + 1;
                    i = i + 1;
                }
                
                else {
                    result = false;
                    break;
                }
                    
            }
            
        }
        return result;
    }
}

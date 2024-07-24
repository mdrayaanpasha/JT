// no of words and characters
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        str = in.next();
        System.out.println("The number of characters are " +  str.length());
        
        
        String[] Words = str.trim().split("//s+");
        int n = Words.length;
        System.out.println("The number of words are " +  n);
        
        
    }
}

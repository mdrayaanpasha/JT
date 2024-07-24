//vowels code - not teaching again!
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        str = in.next();
        str = str.toLowerCase();
        
        int counter = 0;
        for(int i=0;i<str.lenght();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='i' || str.charAt(i)== 'e' || str.charAt(i) == 'o' || str.charAt(i)== 'u'){
                counter++;
            }
        }
        
        
        
    }
}

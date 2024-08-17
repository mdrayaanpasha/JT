public class CharacterFrequency {

    public static void main(String[] args) {
        String st = "bbbababababasbbasdbasbdasbcbasdba";
    
        char[] unique = new char[st.length()];
        int[] freq = new int[st.length()];
        
        int uniqueCount = 0;
        
      
        for (int i = 0; i < freq.length; i++) {
            freq[i] = 0;
        }
        
      
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            boolean isUnique = true;
            
       
            for (int j = 0; j < uniqueCount; j++) {
                if (ch == unique[j]) {
                    isUnique = false;
                    break;
                }
            }
            
      
            if (isUnique) {
                unique[uniqueCount] = ch;
                freq[uniqueCount] = 1;
                uniqueCount++;
            } else {
            
                for (int j = 0; j < uniqueCount; j++) {
                    if (ch == unique[j]) {
                        freq[j]++;
                        break;
                    }
                }
            }
        }
   
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println("Character '" + unique[i] + "' appears " + freq[i] + " times.");
        }
    }
}

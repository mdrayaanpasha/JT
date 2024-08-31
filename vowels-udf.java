class Shaitan{
    public void display(String Word){
        int n=Word.length();
        Word=Word.toUpperCase();
       
        for(int i=0;i<=n-1;i++){
            if(Word.charAt(i)=='A' || Word.charAt(i)=='E' || Word.charAt(i)=='I' || Word.charAt(i)=='O' || Word.charAt(i)=='U'){
                System.out.println(Word.charAt(i));
            }
        }
        
    }
    
    public static void main(String args[]){
        Shaitan S = new Shaitan();
        S.display("HEllO");
    }
}

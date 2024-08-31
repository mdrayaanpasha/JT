class Prime{
    public void shaitan(int num){
        int counter=0;
        for(int i=1;i<=num;i++){
            if(num % i == 0){
                counter++;
            }
        }
        
        if(counter > 2){
            System.out.println("its not prime");
        }else{
            System.out.println("its prime");

        }
        
    }
    
    public static void main(String args[]){
        Prime S = new Prime();
        S.shaitan(16);
    }
}

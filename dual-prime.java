class Prime{
    public void shaitan(int num1, int num2){
        int counter1=0;
        for(int i=1;i<=num1;i++){
            if(num1 % i == 0){
                counter1++;
            }
        }
        int counter2=0;
        for(int i=1;i<=num2;i++){
            if(num2 % i == 0){
                counter2++;
            }
        }
        
        if(counter1 > 2){
            System.out.println("num1 is  not prime");
        }else{
            System.out.println("num1 is  prime");

        }
        
        if(counter2 > 2){
            System.out.println("num2 is  not prime");
        }else{
            System.out.println("num1 is  prime");

        }
        
    }
    
    public static void main(String args[]){
        Prime S = new Prime();
        S.shaitan(11,4);
    }
}

public class Main {
    public void display() {
        int[] Arr = {1, 2, 1, 2, 1};
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < Arr.length; j++) {
                System.out.print(Arr[j] + "\t"); 
            }
            System.out.println();
        }
    }

    public void display(int m, int n) {
      
        System.out.println(m / n);
    }

    public double display(double A, double B, double C) {
    
        double P = (A + B) / C;
        double Q = A + B + C;

        return P * Q;
    }

    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println("Array Display:");
        obj.display();

        System.out.println("Integer Division:");
        obj.display(10, 2);

        System.out.println("Double Calculation:");
        double result = obj.display(1.0, 2.0, 3.0);
        System.out.println("Result: " + result);
    }
}

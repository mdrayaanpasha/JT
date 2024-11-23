import java.util.Scanner;

public class Main {
    String Words;

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        this.Words = scanner.nextLine();
    }

    public int Process() {
        this.Words = this.Words.toUpperCase();

        int N = this.Words.length();
        int Counter = 0;
        boolean check = true;

        for (int i = 0; i < N; i++) {
            char c = Words.charAt(i);
            if (check && c == 'A') {
                Counter++;
                check = false; 
            }
            if (c == ' ') {
                check = true;
            }
        }

        return Counter-1;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.Input();
        int result = obj.Process();
        System.out.println("Count of 'A' at the start of words: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        String S = "ABCD";
        char[] SArr = S.toCharArray();
        for (int i = 0; i < S.length(); i++) {
            System.out.println(String.valueOf(SArr, 0, S.length() - i));
        }
    }
}

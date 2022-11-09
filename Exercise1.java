import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introidu textul: ");
        String str = input.nextLine();
        System.out.println("Numarul de cuvinte: " + getTotalNumberOfWords(str));
    }
    static int getTotalNumberOfWords(String str) {
        // TODO Total number of words - (numarul total de cuvinte separate prin spatiu)
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        return count;
    }
}
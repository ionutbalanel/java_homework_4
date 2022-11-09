import java.util.Objects;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introdu textul: ");
        String string = s.nextLine();
        System.out.println("In acest text se repeta : " + getAmountOfDuplicatedWords(string) + " cuvant/e");
    }
    static int getAmountOfDuplicatedWords(String string) {
        // TODO The amount of duplicated words - (cite cuvinte apar in text de 2 sau mai multe ori)
        int count, repeated = 0;

        string = string.toLowerCase();

        String[] words = string.split(" ");

        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && !Objects.equals(words[i], "0")) {
                repeated++;
            }
        }
        return repeated;
    }
}
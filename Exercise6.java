import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Exercise6 {
    public static void main(String[] args) {
        // TODO The shortest word - (cel mai scurt cuvint)
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter  string you want to check: ");
        String sentence = scan.nextLine();

        List<String> words = Arrays.asList(sentence.split(" "));

        String shortestWord = words.stream().min(
                        Comparator.comparing(
                                String::length))
                .get();

        System.out.println(shortestWord);
    }
}
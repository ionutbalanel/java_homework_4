import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        // TODO The amount of occurrences for every word - (pentru fiecare cuvint de cite ori se intilneste in text)
        Scanner s = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = s.nextLine();
        Map<String, Integer> hashMap = new HashMap<>();

        String[] words = str.split(" ");

        for (String word : words) {
            if (hashMap.containsKey(word))
                hashMap.put(word, hashMap.get(word) + 1);
            else
                hashMap.put(word, 1);
        }
        System.out.println(hashMap);
    }
}
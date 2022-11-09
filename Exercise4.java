import java.util.Scanner;

class Exercise4 {
    public static void main(String[] args) {
        // TODO All palindrome words - (toate cuvintele palindrom)
        Scanner a = new Scanner(System.in);
        System.out.print("Enter  string you want to check: ");
        String s1 = a.nextLine();

        String[] array1 = s1.split(" ");
        int count = 0;

        for (String s : array1) {
            StringBuilder s2 = new StringBuilder();
            for (int j = (s.length()) - 1; j >= 0; j--) {
                s2.append(s.charAt(j));
            }
            if (s.equalsIgnoreCase(s2.toString())) {
                count++;
                System.out.print(s2 + " ");
            }
        }
        System.out.println();
        System.out.println("Total cuvinte palindrum sunt: " + count);
    }
}
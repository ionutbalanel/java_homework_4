import java.util.Scanner;

class Exercise5 {
    public static void main(String[] args) {
        // TODO The longest word - (cel mai lung cuvint)
        Scanner a = new Scanner(System.in);
        System.out.print("Enter  string you want to check: ");
        String s = a.nextLine();

        String[] word=s.split(" ");
        String rts=" ";
        for (String value : word) {
            if (value.length() >= rts.length()) {
                rts = value;
            }
        }
        System.out.println(rts);
    }
}
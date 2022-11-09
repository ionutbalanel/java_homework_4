import java.util.Scanner;

class Exercise7 {
    public static void main(String[] args) {
        // TODO Total count of letters - (numarul de litere)
        Scanner myScan = new Scanner(System.in);
        String s;
        System.out.print("Enter text from keyboard: ");
        s = myScan.nextLine();
        System.out.println("Numarul de litere: " + s.replace(" ", "").length());
    }
}
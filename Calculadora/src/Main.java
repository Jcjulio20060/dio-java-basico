import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close(); int result = 0;
        String[] numbers = text.split(" ");
        int x = Integer.parseInt(numbers[0]);
        int y = Integer.parseInt(numbers[2]);
        result = switch (numbers[1]) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            default -> result;
        };
        System.out.println(result);
    }
}
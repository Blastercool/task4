import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        try {
            String output = calc(input);
            System.out.println(output);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
    public static String calc(String input) {
        String[] dataInput = input.split(" ");
        if (dataInput.length != 3) {
            throw new IllegalArgumentException("throws Exception");
        }
        int num1 = Integer.parseInt(dataInput[0]);
        int num2 = Integer.parseInt(dataInput[2]);
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new IllegalArgumentException("throws Exception");
        }
        int result;
        switch (dataInput[1]) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    throw new IllegalArgumentException("throws Exception");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("throws Exception");
        }
        return String.valueOf(result);
    }
}

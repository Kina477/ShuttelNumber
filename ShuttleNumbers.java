package numbering_of_shuttles;

public class ShuttleNumbers {
    public static void main(String[] args) {
        int i = 1;
        int number = 0;
        int value = 0;

        while (number < 100) {
            String s = String.valueOf(++value);
            if (s.contains("4") || s.contains("9")) {
                continue;
            }
            System.out.println("Shuttle" + i++ + " now assigned the number: " + value);
            number++;
        }
    }
}
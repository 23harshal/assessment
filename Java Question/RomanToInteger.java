import java.util.*;

public class RomanToInteger {
    public static int romanToInteger(String roman) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            char ch = roman.charAt(i);

            if (i > 0 && map.get(ch) > map.get(roman.charAt(i - 1))) {
                result += map.get(ch) - 2 * map.get(roman.charAt(i - 1));
            } else {
                result += map.get(ch);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a roman number");
        String romanNumber = sc.next();
        int result = romanToInteger(romanNumber);
        System.out.println("The Roman Number is: " + romanNumber);
        System.out.println("Its Integer Value is: " + result);
    }
}

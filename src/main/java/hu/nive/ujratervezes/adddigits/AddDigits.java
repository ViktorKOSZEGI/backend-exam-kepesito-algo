package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    //todo: implement your solution here
    public int addDigits(String input) {
        int sum = 0;
        if ("".equals(String.valueOf(input)) || "null".equals(String.valueOf(input))) {
            return -1;
        }
        for (int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        return sum;
    }
}

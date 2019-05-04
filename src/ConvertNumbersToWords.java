import java.io.Console;
import java.util.Scanner;

/**
 * The class for the program that converts input strings of numbers into words.
 * Examples:     Input: “123.45”
 *               Output: “ONE HUNDRED AND TWENTY-THREE DOLLARS AND FORTY-FIVE CENTS”
 * @Author: Leon Zheng
 * For TechnologyOne Skill Test
 */
public class ConvertNumbersToWords {
    private static String[] underTwenty = new String[] {
            "ONE",//1
            "TWO",//2
            "THREE",//3
            "FOUR",//4
            "FIVE",//5
            "SIX",//6
            "SEVEN",//7
            "EIGHT",//8
            "NINE",//9
            "TEN",//10
            "ELEVEN",//11
            "TWELVE",//12
            "THIRTEEN",//13
            "FOURTEEN",//14
            "FIFTEEN",//15
            "SIXTEEN",//16
            "SEVENTEEN",//17
            "EIGHTEEN",//18
            "NINETEEN"///19
    };

    private static String[] underHundred = new String[] {
            "TWENTY",//20
            "THIRTY",//30
            "FORTY",//40
            "FIFTY",//50
            "SIXTY",//60
            "SEVENTY",//70
            "EIGHTY",//80
            "NINETY"//90
    };

    public static void main(String[] arguments){
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter number: ");
        String words = console.nextLine();
        try {
            System.out.println("The converted number is: ");
            String numbers = ConvertNumbersToWords(words);
            System.out.println(numbers);
        } catch(NumberFormatException e) {
            System.out.println("Incorrect Format!");
            System.exit(1);
        }
    }

    /**
     * A program that converts input strings of numbers into words.
     *          @param NumberString
     *          @return
     * Examples:     Input: “123.45”
     *               Output: “ONE HUNDRED AND TWENTY-THREE DOLLARS AND FORTY-FIVE CENTS”
     * @Author: Leon Zheng
     * For TechnologyOne Skill Test
     */
    public static String ConvertNumbersToWords(String NumberString){
        String integerPart, decimalPart = new String();
        if (NumberString.contains(".")) { //If the entered number has a decimal point
            integerPart = NumberString.substring(0, NumberString.indexOf('.'));
            decimalPart = NumberString.substring(NumberString.indexOf('.')+1,NumberString.length());
            return NumberToWords(integerPart) + " AND " + NumberToWords(decimalPart) + " CENTS";
        }
        double numbers;
        numbers = Double.valueOf(NumberString);
        return " intPart: "+NumberString;
    }

    /**
     * Helper function which actual does the heavy lifting and converts numbers to words.
     * Please note this function expects the string to be integers great than zero.
     * @param numbers a integer that's great than zero
     * @return
     */
    public static String NumberToWords(String numbers) {
        String convertedNumber = new String();
        int numbersInt = Integer.valueOf(numbers);
        if (numbersInt < 20) {
            return underTwenty[numbersInt - 1];
        }
        int ones,tens,hundreds;

        ones = numbersInt % 10;
        return convertedNumber;
    }
}

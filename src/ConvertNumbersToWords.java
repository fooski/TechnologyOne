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
            "",//pad
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
            "",//pad
            "",//pad
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
            if (Integer.valueOf(integerPart) == 0) {
                if (Integer.valueOf(decimalPart) == 1) {
                    return "ONE CENT";
                }
                return NumberToWords(decimalPart) + " CENTS";
            } else if (Integer.valueOf(decimalPart) == 0) {
                if (Integer.valueOf(integerPart) == 1) {
                    return "ONE DOLLAR";
                }
                return NumberToWords(integerPart) + " DOLLARS";
            }
            if (Integer.valueOf(decimalPart) == 1) {
                return NumberToWords(integerPart) + " DOLLARS AND " + "ONE CENT";
            } else if (Integer.valueOf(integerPart) == 1) {
                return "ONE DOLLAR AND " + NumberToWords(decimalPart) + " CENTS";
            }
            return NumberToWords(integerPart) + " DOLLARS AND " + NumberToWords(decimalPart) + " CENTS";
        }
        return NumberToWords(NumberString) + " DOLLARS";
    }
    /**
     * Helper function which actually does the heavy lifting and converts numbers to words.
     * Please note this function expects the string to be integers great than zero.
     * @param numbers a integer that's great than zero
     * @return The string which represents the converted number
     */
    public static String NumberToWords(String numbers) {
        int numbersInt = Integer.valueOf(numbers);
        if (numbersInt == 0) {
            return "";
        }else if (numbersInt < 20) {
            return underTwenty[numbersInt];
        } else if (numbersInt < 100) { //20-99
            int tens = numbersInt / 10;
            int ones = numbersInt % 10;
            if (ones > 0) {
                return underHundred[tens] + "-" + underTwenty[ones];
            } else {
                return underHundred[tens];
            }
        } else if (numbersInt < 1000) { //100-999
            int hundreds = numbersInt / 100;
            int tens = (numbersInt - hundreds * 100) / 10;
            int ones = numbersInt % 10;
            if (tens == 0 && ones == 0) {
                return underTwenty[hundreds] + " HUNDRED";
            }
            return underTwenty[hundreds] + " HUNDRED" + " AND " + NumberToWords(Integer.toString(numbersInt - hundreds * 100));
        } else if (numbersInt < 10000) { //1000-9999
            int thousands = numbersInt / 1000;
            int hundreds = (numbersInt - thousands * 1000) / 100;
            int tens = (numbersInt - thousands * 1000 - hundreds * 100) / 10;
            int ones = numbersInt % 10;
            if (hundreds == 0 && tens == 0) {
                if (ones == 0) {
                    return NumberToWords(Integer.toString(thousands)) + " THOUSAND";
                }
                return NumberToWords(Integer.toString(thousands)) + " THOUSAND AND " + NumberToWords(Integer.toString(numbersInt - thousands * 1000));
            }
            return NumberToWords(Integer.toString(thousands)) + " THOUSAND " + NumberToWords(Integer.toString(numbersInt - thousands * 1000));
        }
        return "";
    }
}

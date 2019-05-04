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
    String[] underTwenty = new String[] {
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

    String[] underHundred = new String[] {
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
     * Examples:     Input: “123.45”
     *               Output: “ONE HUNDRED AND TWENTY-THREE DOLLARS AND FORTY-FIVE CENTS”
     * @Author: Leon Zheng
     * For TechnologyOne Skill Test
     */
    public static String ConvertNumbersToWords(String NumberString){
        String words = new String();
        double numbers;
        numbers = Double.valueOf(NumberString);
        return NumberString;
    }
}

import java.io.Console;
import java.util.Scanner;

/**
 * placeholder
 */
public class ConvertNumbersToWords {
    String [] underTwenty = new String[] {
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
    public static void main(String[] arguments){
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter number: ");
        String words = console.nextLine();
        String numbers = ConvertNumbersToWords(words);
        System.out.println("The converted number is: ");
        System.out.println(numbers);
    }

    /**
     * A program that converts
     */
    public static String ConvertNumbersToWords(String NumberString){
        String words = new String();
        float numbers;
        try {
            numbers = Float.valueOf(NumberString);
        } catch(NumberFormatException e) {
            System.err.println("NumberFormatException: " + e.getMessage());
        }
        return NumberString;
    }
}

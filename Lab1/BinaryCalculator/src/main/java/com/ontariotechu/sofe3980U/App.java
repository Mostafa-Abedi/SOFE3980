package com.ontariotechu.sofe3980U;
import java.util.Scanner;
import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Binary binary1=new Binary("00010001000");
        System.out.println( "First binary number is "+binary1.getValue());
		Binary binary2=new Binary("111000");
        System.out.println( "Second binary number is "+binary2.getValue());
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Their summation is "+sum.getValue());
		Binary orResult = binary1.OR(binary1, binary2);
		System.out.println("The OR of the two binary values is: " + orResult.getValue());

		Binary andResult = binary1.AND(binary1, binary2);
		System.out.println("The AND of the two binary values is: " + andResult.getValue());

		Binary multiplyResult = Binary.Multiply(binary1, binary2);
		System.out.println("The product of the values is: " + multiplyResult.getValue());

		scanner.close();
    }
}

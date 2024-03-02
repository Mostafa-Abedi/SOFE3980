package com.ontariotechu.sofe3980U;
import java.util.HashMap;

/**
 * Unsigned integer Binary variable
 *
 */
public class Binary {
	private String number = "0"; // string containing the binary value '0' or '1'

	/**
	 * A constructor that generates a binary object.
	 *
	 * @param number a String of the binary values. It should conatins only zeros or
	 *               ones with any length and order. otherwise, the value of "0"
	 *               will be stored. Trailing zeros will be excluded and empty
	 *               string will be considered as zero.
	 */
	public Binary(String number) {
		for (int i = 0; i < number.length(); i++) {
			// check each character if it's not 0 or 1
			char ch = number.charAt(i);
			if (ch != '0' && ch != '1') {
				number = "0"; // if not store "0" and end the function
				return;
			}
		}
		// remove any trailing zeros
		int beg;
		for (beg = 0; beg < number.length(); beg++) {
			if (number.charAt(beg) != '0')
				break;
		}
		// beg has the index of the first non zero digit in the number
		this.number = number.substring(beg); // exclude the trailing zeros if any
		// uncomment the following code

		if (this.number == "") { // replace empty strings with a single zero
			this.number = "0";
		}
	}

	/**
	 * Return the binary value of the variable
	 *
	 * @return the binary value in a string format.
	 */
	public String getValue() {
		return this.number;
	}

	/**
	 * Performing a binary OR bitwise operations on two binary variables.
	 *
	 * @param num1 The first ORed object
	 * @param num2 The second ORed object
	 * @return A resulting binary variable from the OR bitwise operation of <i> num1
	 *         OR num2 </i>
	 */
	public static Binary or(Binary num1, Binary num2) {
		int ind1 = num1.number.length() - 1;
		int ind2 = num2.number.length() - 1;
		String num3 = "";
		while (ind1 >= 0 || ind2 >= 0) // loop until both of the indices reach 0 (e.g. loop through all the bits of the lowest binary number)
		{ 
			if (ind1>=0 && num1.number.charAt(ind1) == '1') { // If one of the bits is true,
				num3 = '1' + num3; // append 1 to the current number
				
			}
			else if (ind2>=0 && num2.number.charAt(ind2) == '1') // If one of the bits is true,
			{
				num3 = '1' + num3; // append 1 to the current number
			}
			else 
			{
				num3 = '0' + num3;
			}

			if(ind1>=0){
				ind1--; // decrease appendix for num1 by 1
			}

			if(ind2>=0){
				ind2--; // decrease appendix for num1 by 1
			}
		}
		Binary result = new Binary(num3); // create a new binary object
		return result; // returns the result of the bitwise operator OR for the 2 numbers
	}

	/**
	 * Performing a binary AND bitwise operations on two binary variables.
	 *
	 * @param num1 The first ANDed object
	 * @param num2 The second ANDed object
	 * @return A resulting binary variable from the AND bitwise operation of <i> num1
	 *         AND num2 </i>
	 */
	public static Binary and(Binary num1, Binary num2) {
		int ind1 = num1.number.length() - 1;
		int ind2 = num2.number.length() - 1;
		String num3 = "";
		while (ind1 >= 0 || ind2 >= 0) // loop until both of the indices reach 0 (e.g. loop through all the bits of the lowest binary number)
		{ 
			//Check each bit index to avoid out of bounds issues, if out of bounds by default the value is zero (leading zeroes filled in to match the length of the larger variable)
			char num1bit = ind1 >= 0 ? num1.number.charAt(ind1) : '0';
			char num2bit = ind2 >= 0 ? num2.number.charAt(ind2) : '0';
			//Check if either bits are zero 
			if(num1bit == '0' || num2bit == '0'){
				num3 = '0' + num3; // if either are zero, add a 1 bit to num3
			}
			else{
				num3 = '1' + num3; // if neither are zero, add a 1 bit to num3
			}

			if(ind1>=0){
				ind1--; // decrease appendix for num1 by 1
			}

			if(ind2>=0){
				ind2--; // decrease appendix for num1 by 1
			}
		}
		Binary result = new Binary(num3); // create a new binary object
		return result; // returns the result of the bitwise operator  for the 2 numbers
	}

	/**
	 * Performing a binary bitwise multiplication operation on two binary variables using booth's algorithm.
	 *
	 * @param num1 The first object: the multiplier
	 * @param num2 The second object: the multiplicand
	 * @return A resulting binary variable from the multiplication operation of <i> num1
	 *         x num2 </i>
	 */
	public static Binary multiply(Binary num1, Binary num2) {
		int ind2 = num2.number.length() - 1;
		Binary num3 = new Binary("");

		for(int i = 0; i <= ind2; i++){
			if(num2.number.charAt(ind2 - i) == '1'){ // Check if the next char is '1'
				num3 = add(num3, num1); // Add num3 to num1 if true
			}
			num1 = new Binary(num1.number + "0"); // add a zero to the end of num1
		}
		return num3;
	}
	

	/**
	 * Adding two binary variables. For more information, visit
	 * <a href="https://www.wikihow.com/Add-Binary-Numbers"> Add-Binary-Numbers
	 * </a>.
	 *
	 * @param num1 The first addend object
	 * @param num2 The second addend object
	 * @return A binary variable with a value of <i>num1+num2</i>.
	 */
	public static Binary add(Binary num1, Binary num2) {
		// the index of the first digit of each number
		int ind1 = num1.number.length() - 1;
		int ind2 = num2.number.length() - 1;
		// initial variable
		int carry = 0;
		String num3 = ""; // the binary value of the sum
		while (ind1 >= 0 || ind2 >= 0 || carry != 0) // loop until all digits are processed
		{
			int sum = carry; // previous carry
			if (ind1 >= 0) { // if num1 has a digit to add
				sum += (num1.number.charAt(ind1) == '1') ? 1 : 0; // convert the digit to int and add it to sum
				ind1--; // update ind1
			}
			if (ind2 >= 0) { // if num2 has a digit to add
				sum += (num2.number.charAt(ind2) == '1') ? 1 : 0; // convert the digit to int and add it to sum
				ind2--; // update ind2
			}
			carry = sum / 2; // the new carry
			sum = sum % 2; // the resultant digit
			num3 = ((sum == 0) ? "0" : "1") + num3; // convert sum to string and append it to num3
		}
		Binary result = new Binary(num3); // create a binary object with the calculated value.
		return result;

	}
}
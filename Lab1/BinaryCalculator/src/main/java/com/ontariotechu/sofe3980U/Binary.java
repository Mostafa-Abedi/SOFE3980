package com.ontariotechu.sofe3980U;

/**
 * Unsigned integer Binary variable
 *
 */
public class Binary
{
	private String number="0";  // string containing the binary value '0' or '1'

    public Binary(String number) {
		for (int i = 0; i < number.length(); i++) {
			// check each character if it's not 0 or 1
			char ch=number.charAt(i);
			if(ch!='0' && ch!='1') {
				number="0"; // if not store "0" and end the function
				return;
			}
		}
		// remove any trailing zeros
		int beg;
		for (beg = 0; beg < number.length(); beg++) {
			if (number.charAt(beg)!='0')
				break;
		}
		//beg has the index of the first non zero digit in the number
		this.number=number.substring(beg); // exclude the trailing zeros if any
		// uncommented the following code
		
		if(this.number=="") { // replace empty strings with a single zero
			this.number="0";
		}
		
    }
	/**
	* Return the binary value of the variable
	*
	* @return the binary value in a string format.
	*/
	public String getValue()
	{
		return this.number;
	}

	public static Binary add(Binary num1,Binary num2)
	{
		// the index of the first digit of each number
		int ind1=num1.number.length()-1;
		int ind2=num2.number.length()-1;
		//initial variable
		int carry=0;
		String num3="";  // the binary value of the sum
		while(ind1>=0 ||  ind2>=0 || carry!=0) // loop until all digits are processed
		{
			int sum=carry; // previous carry
			if(ind1>=0){ // if num1 has a digit to add
				sum += (num1.number.charAt(ind1)=='1')? 1:0; // convert the digit to int and add it to sum
				ind1--; // update ind1
			}
			if(ind2>=0){ // if num2 has a digit to add
				sum += (num2.number.charAt(ind2)=='1')? 1:0; // convert the digit to int and add it to sum
				ind2--; //update ind2
			}
			carry=sum/2; // the new carry
			sum=sum%2;  // the resultant digit
			num3 =( (sum==0)? "0":"1")+num3; //convert sum to string and append it to num3
		}
		Binary result=new Binary(num3);  // create a binary object with the calculated value.
		return result;
		
	}

	 public static Binary OR(Binary num1, Binary num2) {
		int len1 = num1.number.length();
		int len2 = num2.number.length();
		int len = Math.max(len1, len2);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < len; i++) {
			char digit1 = (i < len1) ? num1.number.charAt(len1 - 1 - i) : '0';
			char digit2 = (i < len2) ? num2.number.charAt(len2 - 1 - i) : '0';
			result.insert(0, (digit1 == '1' || digit2 == '1') ? '1' : '0');
		}
		return new Binary(result.toString());
	}


	public static Binary AND(Binary num1, Binary num2) {
		int len1 = num1.number.length();
		int len2 = num2.number.length();
		int len = Math.min(len1, len2);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < len; i++) {
			char digit1 = num1.number.charAt(len1 - 1 - i);
			char digit2 = num2.number.charAt(len2 - 1 - i);
			result.insert(0, (digit1 == '1' && digit2 == '1') ? '1' : '0');
		}
		return new Binary(result.toString());
	}



	public static Binary Multiply(Binary num1, Binary num2) {
		// Convert binary numbers to integers for multiplication
		int intNum1 = Integer.parseInt(num1.getValue(), 2);
		int intNum2 = Integer.parseInt(num2.getValue(), 2);

		// Compute the product
		int product = intNum1 * intNum2;

		// Convert the product back to binary string
		String binaryProduct = Integer.toBinaryString(product);

		// Create a new Binary object with the binary product
		return new Binary(binaryProduct);
	}
}	

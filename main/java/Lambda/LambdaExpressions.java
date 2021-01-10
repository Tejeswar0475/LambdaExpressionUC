package Lambda;

import java.util.regex.*;

import com.google.common.base.Predicate;

@FunctionalInterface
interface Test {
	public String validation(String userInput);

}

public class LambdaExpressions extends Exception
{
	
	 boolean nameTest(String name)	throws InvalidInputExceptionLambda
	    {
	        Predicate<String> matcher = n ->(n.matches("^[A-Z]{1}[A-Za-z]{2,12}$"));
	        if (matcher.test(name))
	            return true;
	        else
	            throw new InvalidInputExceptionLambda("Enter First Letter Capital ");

	    }
	    boolean mobileNumberTest(String number) throws InvalidInputExceptionLambda
	    {
	        Predicate<String> matcher = n ->(n.matches("^[0-9]{2}\s[1-9]{1}[0-9]{9}$"));
	        boolean result=matcher.test(number);
	        if (result)
	            return true;
	        else
	            throw new InvalidInputExceptionLambda("Enter phone number in this format (ex:91 1234567890)");
	    }
	    boolean emailTest(String email)	throws InvalidInputExceptionLambda
	    {
	       Predicate<String> matcher = n ->(n.matches("^([a-zA-Z0-9]+)([_+.-]{1}[a-z0-9]+)*@([A-Za-z0-9]+).([a-z]{2,4})((.[a-z]{2,3})?)$"));
	        boolean result=matcher.test(email);
	        if (result)
	            return true;
	        else
	            throw new InvalidInputExceptionLambda("Email should be  like abc.xyz@gmail.com.on with xyz and .in optional ");
	    }
	    
	  
	    boolean passwordTest(String password) throws InvalidInputExceptionLambda
	    {
	        Predicate<String> matcher = n ->(n.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!_%*#?&]{1})[a-zA-Z0-9@$!_%*#?&]{8,}$"));
	        boolean result=matcher.test(password);
	        if (result)
	            return true;
	        else
	            throw new InvalidInputExceptionLambda("Password should have at minimum one uppercase and one numeric and exctly one special char ");
	    }

}
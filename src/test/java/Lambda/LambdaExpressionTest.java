package Lambda;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Scanner;

public class LambdaExpressionTest {

	
	
	@Test
    public void NameTest()
    {
        try {
            try {
            	LambdaExpressions name = new LambdaExpressions();            	
                boolean output = name.nameTest("ilta");
                assertTrue(output);
            }
            catch (NullPointerException e) {
                e.printStackTrace();
            }
        } catch (InvalidInputExceptionLambda e) {
            e.printStackTrace();
        }
    }

    @Test
    public void EmailIdTest()
    {
      try
       {    try
            {
    	   LambdaExpressions newEmail = new LambdaExpressions();
                boolean output = newEmail.emailTest("abcsa1234@gmail.com");
                assertTrue(output);
            }
            catch (NullPointerException e)
             {
                e.printStackTrace();
             }
       }
       catch(InvalidInputExceptionLambda e)
       {
           e.printStackTrace();
       }
    }

	@Test
	public void MobileTest()
	{
	    try
       {    try
            {
    	   LambdaExpressions phoneNumber = new LambdaExpressions();
                boolean output = phoneNumber.mobileNumberTest("91 2125663355");
                assertTrue(output);
            }
             catch (NullPointerException e)
             {
                e.printStackTrace();
             }
       }
       catch(InvalidInputExceptionLambda e)
       {
           e.printStackTrace();
       }
	}

    @Test
    public void PasswordTest()
    {
       try
       {    try
            {
    	   LambdaExpressions passWord = new LambdaExpressions();
               boolean output = passWord.passwordTest("homas#2@87B");
               assertTrue(output);
            }
             catch (NullPointerException e)
             {
                e.printStackTrace();
             }
       }
       catch(InvalidInputExceptionLambda e)
       {
           e.printStackTrace();
       }
    }
	
	
}

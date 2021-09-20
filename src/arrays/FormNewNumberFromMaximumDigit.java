package arrays;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FormNewNumberFromMaximumDigit
{

	private int formNewNumber(int[] n) {
		String newnum = "";
	    for(int i=0;i<n.length;i++)
	    {
	        String ns = Integer.toString(n[i]);
	        char[] cs = ns.toCharArray();
	        Arrays.sort(cs);
	        newnum = newnum + cs[cs.length-1];
	        
	    }
	    int newNum = Integer.parseInt(newnum);
		return newNum;
	}
	
	@Test
	public void testCase1()
	{
		int[] n = {4554,292,123567};
		Assert.assertEquals(formNewNumber(n), 597);
	}
	
	@Test
	public void testCase2()
	{
		int[] n = {90909,111,876};
		Assert.assertEquals(formNewNumber(n), 918);
	}


}

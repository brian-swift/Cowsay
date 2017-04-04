package ie.nttdata.cowsay.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ie.nttdata.cowsay.Cowsay;

public class CowsayTest1 {

	@Test
	public void testCreateDash() {
		Cowsay cs = new Cowsay();
		String result = cs.createDash(5);
		String expectedResult = "---------";
		assertTrue("Dash result length should be " + expectedResult.length() + " but length is " + result.length(), result.equals(expectedResult));
	}

	@Test
	public void testCreateCow() {
		String expectedResult;
		String toSay = "Hello World";
		Cowsay cs = new Cowsay();
		String result = cs.createCow(toSay);
		expectedResult =  cs.createDash(toSay.length())+"\n";
		expectedResult += "< "+ toSay +" >"+"\n";
		expectedResult += cs.createDash(toSay.length())+"\n";
		expectedResult += "  |  ^__^"+"\n";
		expectedResult += "   - (oo)|_______"+"\n";
		expectedResult += "     (__)|       )/|/"+"\n";
		expectedResult += "         ||----w |"+"\n";
		expectedResult += "         ||     ||"+"\n";
		
		assertTrue("Output should be " + expectedResult.toString() + " but is \n" + result.toString(), result.equals(expectedResult));

	}

}

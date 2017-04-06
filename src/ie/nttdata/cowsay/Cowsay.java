package ie.nttdata.cowsay;

public class Cowsay	{
	
	
	public Cowsay() {
	}
	
	public String createDash(int length) {
		//Create a dashed line based on passed in length
		String dashes ="";
		for(int i=0;i<length;i++)	{
			dashes+="-";
		}
		return "--"+dashes+"--";
	}
	
	public String createCow(String cowsay) {
		//Create Cow output
		String output;
		
		output = createDash(cowsay.length())+"\n";
		output += "< "+cowsay+" >"+"\n";
		output += createDash(cowsay.length())+"\n";
		output += "  |  ^__^"            +"\n";
		output += "   - (oo)|_______"    +"\n";
		output += "     (__)|       )/|/"+"\n";
		output += "         ||----w |"   +"\n";
		output += "         ||     ||"   +"\n";
		return output;	
	}
	
}

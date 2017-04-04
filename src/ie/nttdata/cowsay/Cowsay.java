package ie.nttdata.cowsay;

public class Cowsay	{
	
	
	public Cowsay() {
	}
	
	public String createDash(int length) {
		String dashes ="";
		for(int i=0;i<length;i++)	{
			dashes+="-";
		}
		return "--"+dashes+"--";
	}
	
	public String createCow(String cowsay) {
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

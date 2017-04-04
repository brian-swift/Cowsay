package ie.nttdata.cowsay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Launcher {
	
	public static void main(String[] args) throws IOException	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		Cowsay c1 = new Cowsay();
		String cow ="";

		if (args.length == 0) {
			System.out.println("What should the cow say?");
			cow = c1.createCow(stdin.readLine());
		} else {
			cow = c1.createCow(args[0]);
		}
		
		System.out.println(cow);
	}
}

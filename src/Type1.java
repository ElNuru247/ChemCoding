import java.util.Scanner;
public class Type1
{public static void Alkanes()
	{//The formula is CnH2n+2
		Scanner accept=new Scanner(System.in);
		System.out.println("");
		System.out.println("This is The general formula=>CnH2n+2");
		System.out.printf("What is the number of Carbon(C):");
		int carbon=accept.nextInt();
		int hydrogen=(2*carbon)+2;
		if(carbon>10)
		{System.out.println("OUT OF BOND!!!,Carbon must not be Greater than 10");
			System.out.print("press any Number to exit:_");
			accept.nextInt();
			System.exit(0);}

		String[] family={	"Methane","Ethane","Propane",
			"Butane","pentane","Hexane",
			"Heptane","Octane","nonane", "Decane"};
		int i=carbon-1;
		String Name=family[i];
		String formula="C"+carbon+"H"+hydrogen;
		System.out.println("");
		System.out.println("Formula:"+formula+", "+"The Name of the Compound is==>"+Name);
	}
	public static void Alkenes()
	{//The formula is CnH2n
		Scanner accept=new Scanner(System.in);
		System.out.println("");
		System.out.println("This is The general formula=>CnH2n");
		System.out.printf("what is the Number of Carbon(C):");
		int carbon=accept.nextInt();
		int hydrogen=2*carbon;
		if(carbon>10)
		{System.out.println("OUT OF BOND!!!,Carbon must not be Greater than 10");
			System.out.print("press any Number to exit:_");
			accept.nextInt();
			System.exit(0);}

		String[] family={	"Methylene","Ethene","Propene",
			"Butane","pentene","Hexene",
			"Heptene","Octene","nonene", "Decene"};
		int i=carbon-1;
		String Name=family[i];
		String formula="C"+carbon+"H"+hydrogen;
		System.out.println("");
		System.out.println("Formula:"+formula+", "+"The Name of the Compound is==>"+Name);
	}
	public static void Alkynes()
	{//The formula is CnH2n-2
		Scanner accept=new Scanner(System.in);
		System.out.println("");
		System.out.println("This is The general formula=>CnH2n-2");
		System.out.printf("What is the number of Carbon(C):");
		int carbon=accept.nextInt();
		int hydrogen=(2*carbon)-2;
		if(carbon>10)
		{System.out.println("OUT OF BOND!!!,Carbon must not be Greater than 10");
			System.out.print("press any Number to exit:_");
			accept.nextInt();
			System.exit(0);}

		if(carbon<2)
		{System.out.println("");
			System.out.println("2 is the minimum number of carbon in the Alkyne family");
			System.out.print("press any Number to exit:_");
			accept.nextInt();
			System.exit(0);}



		String[] family={"Ethyne","Propyne",
			"Butyne","pentyne","Hexyne",
			"Heptyne","Octyne","nonyne", "Decyne"};
		int i=carbon-2;
		String Name=family[i];
		String formula="C"+carbon+"H"+hydrogen;
		System.out.println("");
		System.out.println("Formula:"+formula+", "+"The Name of the Compound is==>"+Name);
	}
//this is a method that prints an error msg
	void errormsg()
	{
		System.out.println("Invalid input...follow  instructions!");
	}
}
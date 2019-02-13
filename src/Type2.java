import java.util.*;
public class Type2
{
	public static void Alkanes(String Name)
	{//The formula is CnH2n+2

		String[] family={	"Methane","Ethane","Propane",
			"Butane","pentane","Hexane",
			"Heptane","Octane","nonane", "Decane"};

		String[] formula={"CH4","C2H6","C3H8",
			"C4H10","C5H12","C6H14",
			"C7H16","C8H18","C9H20","C10H22"};




		if(Name.equalsIgnoreCase(family[0]))
		{

			System.out.println("The formula is: "+formula[0]);
		}
		else if(Name.equalsIgnoreCase(family[1]))
		{

			System.out.println("The formula is: "+formula[1]);

		}
		else if(Name.equalsIgnoreCase(family[2]))
		{

			System.out.println("The formula is: "+formula[2]);
		}
		else if(Name.equalsIgnoreCase(family[3]))
		{

			System.out.println("The formula is: "+formula[3]);}
		else if(Name.equalsIgnoreCase(family[4]))
		{

			System.out.println("The formula is: "+formula[4]);}
		else if(Name.equalsIgnoreCase(family[5]))
		{
			System.out.println("The formula is: "+formula[5]);
 }
		else if(Name.equalsIgnoreCase(family[6]))
		{

				System.out.println("The formula is: "+formula[6]);
		}

		else if(Name.equalsIgnoreCase(family[7]))
		{

			System.out.println("The formula is: "+formula[7]);}

		else if(Name.equalsIgnoreCase(family[8]))
		{

			System.out.println("The formula is: "+formula[8]);}

		else if(Name.equalsIgnoreCase(family[9]))
		{
			System.out.println("The formula is: "+formula[9]);}
	}
	static void Alkenes(String Name)
	{

		String[] family={	"Methene","Ethene","Propene",
			"Butene","pentene","Hexene",
			"Heptene","Octene","nonene", "Decene"};

		String[] formula={"CH2","C2H4","C3H6",
			"C4H8","C5H10","C6H12",
			"C7H14","C8H16","C9H18","C10H20"};

		if(Name.equalsIgnoreCase(family[0]))
		{

			System.out.println("The formula is: "+formula[0]);
		}
		else if(Name.equalsIgnoreCase(family[1]))
		{

			System.out.println("The formula is: "+formula[1]);
		}

		else if(Name.equalsIgnoreCase(family[2]))
		{
			System.out.println("The formula is: "+formula[2]);
		}
		else if(Name.equalsIgnoreCase(family[3]))
		{
			System.out.println("The formula is: "+formula[3]);}
		else if(Name.equalsIgnoreCase(family[4]))
		{
			System.out.println("The formula is: "+formula[4]);}
		else if(Name.equalsIgnoreCase(family[5]))
		{

			System.out.println("The formula is: "+formula[5]);
			if(Name.equalsIgnoreCase(family[6]))
			{

				System.out.println("The formula is: "+formula[6]);}
		}

		else	 if(Name.equalsIgnoreCase(family[7]))
		{

			System.out.println("The formula is: "+formula[7]);
		}

		else if(Name.equalsIgnoreCase(family[8]))
		{

			System.out.println("The formula is: "+formula[8]);
		}
		else if(Name.equalsIgnoreCase(family[9]))
		{
			System.out.println("The formula is: "+formula[9]);}
	}	
	static void Alkynes(String Name)
	{

		String[] family={"Ethyne","Propyne",
			"Butyne","pentyne","Hexyne",
			"Heptyne","Octyne","nonyne", "Decyne"};

		String[] formula={"C2H2","C3H4","C4H6",
			"C5H8","C6H10","C7H12",
			"C8H14","C9H16","C10H18"};

		if(Name.equalsIgnoreCase(family[0]))
		{
			System.out.println("The formula is: "+formula[0]);
		}
		else if(Name.equalsIgnoreCase(family[1]))
		{
			System.out.println("The formula is: "+formula[1]);

		}
		else if(Name.equalsIgnoreCase(family[2]))
		{
			System.out.println("The formula is: "+formula[2]);
		}
		else if(Name.equalsIgnoreCase(family[3]))
		{
			System.out.println("The formula is: "+formula[3]);}
		else if(Name.equalsIgnoreCase(family[4]))
		{
			System.out.println("The formula is: "+formula[4]);}
		else if(Name.equalsIgnoreCase(family[5]))
		{
			System.out.println("The formula is: "+formula[5]);
			if(Name.equalsIgnoreCase(family[6]))
			{
				System.out.println("The formula is: "+formula[6]);}
		}

		else	 if(Name.equalsIgnoreCase(family[7]))
		{
			System.out.println("The formula is: "+formula[7]);}

		else if(Name.equalsIgnoreCase(family[8]))
		{
			System.out.println("The formula is: "+formula[8]);}

		else if(Name.equalsIgnoreCase(family[9]))
		{
			System.out.println("The formula is: "+formula[9]);}
	}

}
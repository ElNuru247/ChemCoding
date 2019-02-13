
import java.util.*;
import org.apache.http.conn.ssl.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		try{
			while(true)
			{

				System.out.println("press 1 to Input formula and get Name");
				System.out.println("press 2 to input Name and get Formulae\n");

				int A=input.nextInt();
				if(A==2)
				{	Scanner Accept=new Scanner(System.in);
					Type2 Typ2=new Type2();
					System.out.print("Enter the Name of the compound:");
					String Name =Accept.nextLine();

					String[] family={	"Methane","Ethane","Propane",
						"Butane","pentane","Hexane",
						"Heptane","Octane","nonane", "Decane"};

					String[] family2={	"Methene","Ethene","Propene",
						"Butene","pentene","Hexene",
						"Heptene","Octene","nonene", "Decene"};

					String[] family3={"Ethyne","Propyne",
						"Butyne","pentyne","Hexyne",
						"Heptyne","Octyne","nonyne", "Decyne"};

					int i=0;
					while(i<10)
					{
						for(i=0;i<family.length;i++)
						{

							if(Name.equalsIgnoreCase(family[i]))
							{
								Typ2.Alkanes(Name);
							}
							else if(Name.equalsIgnoreCase(family2[i]))
							{
								Typ2.Alkenes(Name);
							}

							if(i<9)
							{
								if(Name.equalsIgnoreCase(family3[i]))
								{
									Typ2.Alkynes(Name);
								}
							}
						}
					}		
				}


				else if(A==1)
				{
					System.out.printf("Welcome to hydrocarbons %nThis is a program that tells you the name %nof the Organic molecular formula you enter%n");
						System.out.println("");
						
						while(true)
						{
						System.out.println("Choose from the organic family below");
						System.out.println("");
						String anes="Alkane family";
						String enes=anes.replace("ane","ene");
						String ynes=enes.replace("ene","yne");
						System.out.printf("(1)%s %n(2)%s %n(3)%s %n",anes,enes,ynes);
						System.out.println("");

						Scanner Accept2= new Scanner(System.in);
						int Num = Accept2.nextInt();

						Type1 Typ1 =new Type1();
						if(Num==1)
						{	Typ1.Alkanes();	}

						else if(Num==2)
						{	Typ1.Alkenes();	}

						else if(Num==3)
						{	Typ1.Alkynes();	}

						else if(Num<1||Num>3)
						{	Typ1.errormsg();
							continue;	}
							}
					}

			else if(A<1||A>3)
				{	
				Type1 Typ1=new Type1();
				Typ1.errormsg();
					continue;	}	
			}
		}
		catch(Exception e)
		{
			System.out.println("\nWe are Very Sorry...(An error occurred!!!)\nPlease Close the program and restart\nThen follow the Instructions...THANKS");
		}

	}
}
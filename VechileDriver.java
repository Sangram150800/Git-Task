import java.util.Scanner;
import java.util.TreeSet;
//import java.util.Comparator;
//import java.util.Comparable;

class VechileDriver
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		TreeSet set=new TreeSet();
		boolean control;
		do
		{
			System.out.println("Enter the vechile Brand");
			String brand=input.next();
			System.out.println("Enter the vechile price");
			double price=input.nextDouble();
			set.add(new Vechile(brand,price));
			System.out.println("Do you want to continue(Y/N)");
			char ch=input.next().charAt(0);
			if(ch=='y'|| ch=='Y')
			control=true;
			else
			control=false;
		}while(control);

		System.out.println(set);
		
	}
}

class Vechile implements Comparable;
{
	String brand;
	double price;
	Vechile(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
	}

	public String toString()
	{
		return "["+this.brand+","+this.price+"]";
	}
	
	public int compareTo(Object o)
	{
		Vechile v=(Vechile)o;
		return (int)(this.price-v.price);
	}
	
}
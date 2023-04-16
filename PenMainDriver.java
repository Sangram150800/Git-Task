import java.util.Comparator;
import java.util.TreeSet;
class PenMainDriver
{
	public static void main(String[] args)
	{
		TreeSet set=new TreeSet<>(new Comparator<Pen>(){
		@Override
		public int compare(Pen p1,Pen p2)
		{
			return (int)(p1.price-p2.price);
		}
		});

		set.add(new Pen("Cello",10));
		set.add(new Pen("Nataraj",25));
		set.add(new Pen("Reynolds",45));
		set.add(new Pen("Sailor",15));
		set.add(new Pen("Lexon",50));
		set.add(new Pen("Cross",35));

		System.out.println(set);
		
	}
}
class Pen
{
	String brand;
	double price;

	Pen(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
	}
	
	public String toString()
	{
		return "["+this.brand+" , "+this.price+"]";
	}
}
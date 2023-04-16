import java.util.Scanner;
import java.util.Comparator;
import java.util.TreeSet;

class BookMainDriver
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		Comparator c=null;
		
		System.out.println("Please choose the appropriate option to sort\n1.sort based upon Book Name\n2.sort based upon author");
		int option=input.nextInt();
		switch(option)
		{
			case 1:
				{
					c=new CompareBookName();
				}
				break;
			case 2:
				{
					c=new CompareAuthor();
				}
				break;
			default:
				{
					System.out.println("Please enter the valid input");
				}
				break;
		}
		TreeSet set=new TreeSet(c);
		set.add(new Book("Srimad Bhagabat Gita","Vyasa"));
		set.add(new Book("Ramayan","Valmiki"));
		set.add(new Book("Indica","Meghastinis"));
		set.add(new Book("Wings of Fire","APJ Abdul Kalam"));
		set.add(new Book("India Pak War 1971","MM Narvane"));


		System.out.println(set);
	}
}
class Book
{
	String bookName;
	String author;

	Book(String bookName,String author)
	{
		this.bookName=bookName;
		this.author=author;
	}

	public String toString()
	{
		return "["+this.bookName+" , "+this.author+"]";
	}

}
class CompareAuthor implements Comparator
{
		@Override
		public int compare(Object o1,Object o2)
		{
			Book b1=(Book)o1;
			Book b2=(Book)o2;
			return b1.author.compareTo(b2.author);
		}
}
class CompareBookName implements Comparator
{
		@Override
		public int compare(Object o1,Object o2)
		{
			Book b1=(Book)o1;
			Book b2=(Book)o2;
			return b1.bookName.compareTo(b2.bookName);
		}
}
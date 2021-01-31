package JavaActivity5;

abstract class Book
{
	String title;
	abstract void setTitle(String s);
	String getTitle()
	{
		return title;
	}

}


class Bookish extends Book
{
	public void setTitle (String s)
	{
		title = s;
	}
}
public class Activity2_1 {

	public static void main(String[] args) 
	{
		String title = "Himalayan Blunder";
		Book newNovel = new Bookish();
		newNovel.setTitle(title);
		System.out.println("The title of the book is : \t" + newNovel.getTitle());
		System.out.println("The title of the book is : \n" + newNovel.getTitle());

	}

}

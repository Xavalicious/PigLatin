import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		boolean valid=true;
		while(valid)
		{
			Scanner wordTaker=new Scanner(System.in);
			String word=wordTaker.next();
			String vowels[]={"a","e","i","o","u"};
			if(word.toUpperCase().equals("STOP"))
				{break;}
			else
			{
			if (word.substring(0,1).equals(vowels[0])||word.substring(0,1).contentEquals(vowels[1])||word.substring(0,1).contentEquals(vowels[2])||word.substring(0,1).contentEquals(vowels[3])||word.substring(0,1).contentEquals(vowels[4]))
				{
				word=word+"yay";
				System.out.println(word);
				}
			else
				{
				String letter=word.substring(0,1);
				word=word.substring(1)+letter+"ay";
				System.out.println(word);
				}
			
			
			}
		}

	}

}

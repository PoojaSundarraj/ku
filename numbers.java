import java.io.*;
import java.util.*;
class numbers
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		char n=s.next().charAt(0);
		if(n>'a'&&'z'>n)
		System.out.println("alphabet");
		else 
		System.out.println("not alphabet");
	}
}

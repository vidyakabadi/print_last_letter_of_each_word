import java.util.Scanner;
public class g1
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String res="";
	    for(int i=0;i<s.length();i++)
	    {
	        if(s.charAt(i)==' ')
	        {
	            res=res+s.charAt(i-1);
	        }
	    }
	    res=res+s.charAt(s.length()-1);
		System.out.println(res);
	}
}

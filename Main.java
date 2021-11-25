import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int ele, n;
      System.out.println ("Enter the number of elemets : ");
      n = s.nextInt ();
      System.out.println ("Enter element to be found : ");
      ele = s.nextInt ();
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      {
	a[i] = s.nextInt ();
      }
    for (int j = 0; j < n; j++)
      {
	if (a[j] == ele)
	  {
	    System.out.println (j);
	    break;
	  }
	else if (a[j] == n - 1)
	  {
	    System.out.println ("element not found");
	  }
      }
  }
}

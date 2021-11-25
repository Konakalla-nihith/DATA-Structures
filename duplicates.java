import java.util.Scanner;
public class duplicates
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int ele, n;
      System.out.println ("Enter the number of elements : ");
      n = s.nextInt ();
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      {
	a[i] = s.nextInt ();
      }
    for (int j = 0; j < n; j++)
      {
	for (int k = j + 1; k < n; k++)
	  {
	    if (a[j] == a[k])
	      {
		System.out.println ("Duplicates are present");
		break;
	      }
	  }
      }
  }
}

import java.util.Scanner;
public class count
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int ele, n;
    int c = 0;
      System.out.println ("Enter the number of elements : ");
      n = s.nextInt ();
      System.out.println ("Enter element to be counted : ");
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
	    c += 1;
	  }
      }
    System.out.println (c);
  }
}

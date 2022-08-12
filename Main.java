
public class Main {
  public static int removeDuplicates(int a[] , int n)
  {
	  // if array size is 1 or 2 it is sorted
	  if( n == 1 || n == 2) {
		  return n;
	  }
	  int j =0;
	  for (int i = 0; i < n - 1; i++) {
          if (a[i] != a[i + 1]) {
              a[j++] = a[i];
          }
      }

      a[j++] = a[n - 1];

      return j;
  }

  public static void main(String[] args)
  {
      int a[] = { 1,2,2,3,3,4,4,5,6,7};

      int n = a.length;
      
      int j=0;
     
      
      j = removeDuplicates(a, n);
      
      // printing array elements
      for (int i = 0; i < j; i++)
          System.out.print(a[i] + " ");
  }

  }


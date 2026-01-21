import java.util.*;
 class Array
{
 public static void main(String args[])
{
  int arr[] = {2,3,4,4,6,8,9,9,2,0};
  LinkedHashSet<Integer> hs = new LinkedHashSet<>();
  for(int a:arr)
  { 
   hs.add(a);
  }
 Iterator it = hs.iterator();
while(it.hasNext())
 {
 System.out.println(it.next());
 }
}
}

  
 
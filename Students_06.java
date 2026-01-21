import java.util.*;
class Students_06
{
 public static void main(String args[])
 {
   if(args.length == 0) 
     {
    System.out.println("No command-line arguments found.");
         return;
        }
     int[] numbers = new int[args.length];
   LinkedHashSet<Integer> ss = new LinkedHashSet<>();
        for (int i = 0; i < args.length; i++) 
          {
            ss.add(Integer.parseInt(args[i]));
          }

 Iterator it = ss.iterator();
 while(it.hasNext())
{
 System.out.println(it.next());
}
}
}

/*Set does niot allow duplicate values. Set is interface in collections . so that we implement set interface using classes like HashSet , LinkedHashSet, TreeSet.
 To preserve insertion order we use LinkedHashSet.if we use LinkedHashSet it add elements in the way we insert. HashSet doesnot maintain intersertions it inserts elements in the random order.
 if we use TreeSet it adds elements in sorted order. so this we prefer LinkedHashSet*/

 
import java.util.*;
class Letter
{
  public static void main(String args[])
{
  char ch = 'P';
  if( ch >= 'a' && ch <='z'|| ch >='A'&& ch <= 'Z')
{
 System.out.print("Alphabet");
}
else if( ch>=0&&ch<=9)
{
 System.out.print("Number");
}
else
{
System.out.print("Special character");
}
}
}
 
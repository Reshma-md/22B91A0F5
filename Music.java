import java.util.*;
abstract class Instrument   
{
 abstract public void play();
}

class Piano extends Instrument 
{
 public void play()
 {
   System.out.println("Piano is playing tan tan tan tan");
 }
}
class Flute extends Instrument 
{
 public void play()
 {
   System.out.println("Flute is playing toot toot toot toot");
 }
}
class Guitar extends Instrument 
{
 public void play()
 {
   System.out.println("Guitar is playing tin tin tin");
 }
}
class Music 
{
 public static void main(String args[])
 {
  Piano p = new Piano();
  p.play();
  Flute f = new Flute();
  f.play();
  Guitar g = new Guitar();
  g.play();
}
} 

 
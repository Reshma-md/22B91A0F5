class Patient 
{
   String name;
   Double height;
   Double weight;
   Patient (String name,Double height, Double weight)
  {
      this.name = name;
      this.height = height;
      this.weight = weight;
  }
  public double computeBMI() 
   {
   return weight/(height*height);
   }
}
class Main
{
 public static void main(String args[])
  {
  Patient p = new Patient("Reshma",21.00,44.78);
  System.out.println("BMI - "+p.computeBMI());
   }
}
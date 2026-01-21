class Person
{
 public void showRole()
{
 System.out.println("Iam a Person");
}
}
class Student extends Person
{
  public void showRole()
{
 System.out.println("Iam a student");
}
}
class Role_05
{
 public static void main(String args[])
 {
 Student s = new Student();
 s.showRole();
}
}

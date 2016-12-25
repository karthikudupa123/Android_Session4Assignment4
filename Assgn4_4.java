public class Assgn4_4 
{
 
 
    public static void main(String args[]) 
    {
   
        
        System.out.println("Constructor chaining Example\n ");
        Child child = new Child("Child");
     
       
        System.out.println("******************************************************************");
        Child empty = new Child();
    }
 
}

class Parent
{
    private String name;
     
//Calling constructor of same class with one argument
    protected Parent()
    {
        this("");
        System.out.println("No argument constructor of Parent called ");
    }
 
// Calling constructor of same class with one String argument
    protected Parent(String name)
    {
        this.name = name;
        System.out.println("Argument constructor of Parent called ");
    }
}

class Child extends Parent
{
    private String name;
 
    
// Calling constructor of same class with one argument
     
    protected Child()
    {
        this("");           //Constructor Chaining happens here       
        System.out.println("No argument constructor of Child called ");
    }
 
    
// Calling constructor of super class with one argument
     
    protected Child(String name)
    {
        super(name);        //Constructor Chaining happens here
        System.out.println("Argument constructor of base class called from sub class ");
    }
}



package oops;

public class DataHiding {
    public static void main(String[] args) {
//        SuperClass.display();
//        SubClass.display();

        SuperClass displaysuperClass=new SuperClass();
        SubClass displaySubClass=new SubClass();
        SuperClass superClassm=new SubClass();
        displaysuperClass.display();
        displaySubClass.display();
        superClassm.display();
    }
}
    class SuperClass{
         void display()
        {
            System.out.println("Display in SuperClass");
        }
    }

    class SubClass extends SuperClass
    {
         void display()
        {
            System.out.println("Display in subcalass");
        }
    }


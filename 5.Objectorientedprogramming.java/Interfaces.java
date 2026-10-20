interface temp{
    void greet(); // public+abstract.
    int a=5;    // public+static+final
}
class tempclass implements temp{
    // Compulsary to add public because default<public
    public void greet(){
        System.out.println("I'm the temp interface function.");
    }
};
// default methods:
interface client{
    void greet1();
    void greet2();
    default void greet3(){
        System.out.println("I'm the greet3 function inside client.");
    }
}
class temp1 implements client{
    public void greet1(){System.out.println("I'm the greet1 function inside temp1.");}
    public void greet2(){System.out.println("I'm the greet2 function inside temp1.");}
    // See we can also override it inside the temp1:
    public void greet3(){System.out.println("I'm the greet3 function inside temp1.");}
};

// Static method:
interface client2{
    static void greet1(){System.out.println("I'm the client2 function.");};
}

// Private method throught default:
interface client3{
    private void sum(int x,int y){
        System.out.println("Addition is:"+(x+y));
    }
    default void add(int x,int y){
        sum(x,y);
    }
};
class base implements client3{
    public void add(int x,int y){};
};

// Private method throught static:
interface client4{
    private static void sum(int x,int y){
        System.out.println("Addition is:"+(x+y));
    }
    static void add(int x,int y){
        sum(x,y);
    }
};

// Inheritance in the interfaces:
interface inter1{
    void show();
}
interface inter2 extends inter1{
    void display();
}
class parent implements inter2{
    public void show(){System.out.println("I'm the inter1 function.");}
    public void display(){System.out.println("I'm the inter2 function.");}
}

// Multiple Inheritance:
interface interf1{
    void print();
}
interface interf2{
    void show();
}
class baseclass{
    private int a,b;
    void set(int x,int y){
        a=x;b=y;
    }
    void get(){System.out.println(a+" "+b);}
};
class multinherit extends baseclass implements interf1,interf2{
    public void show(){System.out.println("I'm the interf2 function.");}
    public void print(){System.out.println("I'm the interf1 function.");}
}
public class Interfaces {
    public static void main(String[] args) {
        // 1.Interfaces=An interfaces is a blueprint of a class.A interface only contains the abstract methods whose implementations provided in the further classes which implement interface.To implement interface in the further classes we use "implements" keyword.
        // Syntax:
        // interface interface_Name{//Body}

        // Inside interface we can add the abstract methods and non-abstract variables.Now the abstract methods are (public+abstract) by default.Also when we implement these abstract method in any other classes it is compulsary to add public keyword with them beacuase if we can'nt use public the visibility mode becomes default only in that particular class but we above discuss the abstract methods are public in nature(default<public).On the other hand all the variables added inside the interfaces are (public+static+final)."public" means they are accessible to all and "static" means they no need any object to use themself and "final" means they need to initialized in the interface and their value can'nt change.

        // e.g.:

        // Normally use:
        // tempclass obj = new tempclass();
        // obj.greet();
        // System.out.println(temp.a);

        // Runtime polymorphism use:
        // temp obj = new tempclass();
        // obj.greet();

        // Additional concept in interfaces = All the concept we discussed above are come inside in the JDK version 1.7.But in JKD version 1.8 and 1.9 we have more functionality we can also add default,static and private methods in the interfaces."default method" it means we can (declare or define) inside the interface or (implement) in the other class also if we want."Static method" it means we can (declare and define) the method inside the interface and they no need any object to use themself."private methods" it means we can (declare and define) the methods inside the interface but it can'nt access to any one.But if we want to use it we can have two ways either we can use (private+default) by doing so we can use the private method similar to the or (private+static) 


        // e.g.:
        // 1. Default methods:

        // Normal use:
        // temp1 obj = new temp1();
        // obj.greet1();
        // obj.greet2();
        // obj.greet3();

        // // Polymorphism use:
        // client obj1 = new temp1();
        // obj1.greet1();
        // obj1.greet2();
        // obj1.greet3();

        
        // 2. Static method:
        // client2.greet1();


        // 3. Private method through static:
        // client4.add(5,5);
        
        // Through default:
        // client3 obj = new base();
        // obj.add(5, 5);


        // 2. Inheritance in the interfaces=Basically one interface can inherit the methods of its parent interface and after that implement by using one class.

        // e.g.:

        // Normal use:
        // parent obj = new parent();
        // obj.show();
        // obj.display();

        // Polymorphism use:
        // inter1 obj = new parent();
        // obj.show();

        // inter2 obj2 = new parent();
        // obj2.show();
        // obj2.display();


        // 3. Multiple inheritance = We know that we can'nt implement multiple inheritance in the classes because while implementing multiple inheritance in the classes there must be a problem arises of the abiguity.But by using the interfaces we can implement the multiple inhertance beacuse in the interface we can implement the method inside the class so their is no chance of abiguity.

        // e.g.:
        // multinherit obj = new multinherit();
        // obj.set(5, 5);
        // obj.get();
        // obj.show();
        // obj.print(); 
        
    }   
}

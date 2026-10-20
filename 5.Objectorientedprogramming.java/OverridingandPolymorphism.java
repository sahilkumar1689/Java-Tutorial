// 1. Method Overriding:
class base{
    void greet(){
        System.out.println("I'm base greet function.");
    }
};
class derived extends base{
    @Override
    void greet(){System.out.println("I'm derived greet function.");}
};

// 2. Run time polymorphism:
class parent{
    int a=5;
    void temp(){System.out.println("I'm the temp function of the parent class.");}
    void greet(){System.out.println("I'm the parent class function.");}
};
class child extends parent{
    int a=10;
    void temp1(){System.out.println("I'm the temp function of the base class.");}
    @Override
    void greet(){System.out.println("I'm the child class function.");}
};

// 3. Run time polymorphism using abstract class and methods:
abstract class parent1{
    // If a class have any abstract method so it is compulsary to add abstract keyword with the class name.
    int a=5;
    void temp(){System.out.println("I'm the temp function of the parent class.");}
    abstract void greet(); // we add abstract to add restriction they need to be implement in its derived classes.
};
class derived1 extends parent1{
    int a=10;
    void temp1(){System.out.println("I'm the temp function of the base class.");}
    @Override
    void greet(){System.out.println("I'm the child class function.");}
};
// Note= 1. You see clearly there is only one difference between in the simple run time polymorphism and in the abstract runtime polymorphism,is that abstract add restriction.

public class OverridingandPolymorphism {
    public static void main(String[] args) {
        // 1. Method Overriding=Before discuss method overriding we need to know what is method overloading,in method overloading we have more than one function with the same name but different set of parameters in the same class.But on the other hand in the method overriding we have more than one function with the same name and with the same parameters in the different set of classes inherited with each other."@override" flag is used to check whether it is overriden or not.In other word,if a subclass provide a specific implementation of a method that is already declared in the superclass is known as method overriding.

        // Uses = 1. To implement the specific method for the subclass.
        // 2. To achieve run time polymorphism.


        // e.g.:

        // derived obj=new derived();
        // obj.greet();



        // 2. Run time polymorphism=Run time polymorphism is also called dynamic binding or dynamic method dispatch.The run time polymorphism is a process in which a overriden method resolve at run time rather than compile time.Basically polymorphism is the combination of two greek words "poly" means many and morhism means "form" i.e. ploymorphism means many form.There are two type of polymorhism runtime and compile time.Compile time achieved by overloading the static methods and run time achieve using method overiding with upcasting.
        // upcasting = It is the process of achieve the run time polymorphism.In this the referance variable of the parent class refer to the object of the child class.In simple word parent class object store the address of the dynamically allocated child class object.

        // e.g.:

        // parent obj = new child(); // Upcasting to achieve the run time polymorphism.
        // obj.greet();  // Possible
        // obj.temp();   // Possible
        // // obj.temp1();  // Not possible


        // Note = 1. In run time polymorhism we can use all the method and properties of the parent class but we only use the overriden method of the child class.
        //2. Run time polymorphism can'nt be achieved by using the methods variable.It means if we make two similar variable in the parent and child classes after that if we try to perform the run time polymorphism.It will not work.
        // e.g.:
        // System.out.println(obj.a);

        // child obj1=new child();
        // System.out.println(obj1.a);

        // 3. You can imagine run time polymorphism is the reverse of the method overriding.


        // 3. Abstract base class and method=A method which is declared by using the "abstract" keyword is called abstract method and they no need to implement in that particular class but they need to implement in the next child class.On the other hand a class which contains atleast one abstract method and also that class can declared using the "abstract" keyword is knowns as the abstract class.

        // Basically a abstract method and class concept is used to add restriction to the user.The restriction is that they has to be implement that function in its derived classes.
        // So,there is no difference between in the run time polymorphism and in the abstract class and method.Usually a complete run time polymorphism is implement using the abstract keyword.


        // e.g.:
        parent1 object=new derived1();
        System.out.println(object.a);
        object.greet();
        object.temp();
        // object.temp1(); // gave error as usually we know.

    }    
}
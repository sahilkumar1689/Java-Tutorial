class NegativeAreaException extends Exception{
    @Override
    public String getMessage(){
        return "The radius can'nt be negative.";
    }
};

public class Othertopic {
    public static double Area(int r) throws NegativeAreaException{
        if(r<0) throw new NegativeAreaException();
        else{
            return (Math.PI *r*r);
        }
    }
    public static void divide() throws ArithmeticException{
        int a=10;
        int b=0;
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        // 1. Throw and Throws = Basically throw keyword is used to throw an exception explicitly by the programmer.We discussed preivously.

        // Throws=But on the other hand the throws keyword is used to declare an exception.It gives an information to the programmer that there might be a case of exception so it's better to be prepared with a try-catch block.

        //e.g.:

        // Arithemtic Exception:
        // try{
        //     divide();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }

        // User defined Exception:
        // try{
        //     Area(-5);
        // }
        // catch(Exception e){System.out.println(e);}
        
        
        
        // 2. Finally block=Finally block containd the code which is always executed whether the exception is handled by the code or not.Basically the fianlly block contains that types of instruction which need to be executed at any situation it can be ralease resourse instruction,close connection instruction etc.
        
        try{
            Area(-5);
        }
        catch(Exception e){System.out.println(e);}
        finally{
            System.out.println("Important line executed.");
        }
        
    }
}

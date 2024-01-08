package interfaces;

public class Interfaces {

    public static void main(String[] args) {
        
        Somethingable sth=new A();
        sth.run();
        
    }
}

interface OMGable{
    void xd();
}

interface Somethingable extends OMGable{
    void run();
}

class A implements Somethingable{
    
    @Override
    public void run(){
        System.out.println("A Something UwU");
    }
    
    @Override
    public void xd(){}
    
}

class B implements OMGable{
    
    @Override
    public void xd(){
        System.out.println("equisde");
    }
}


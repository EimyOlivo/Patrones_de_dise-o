
package Singleton_Java;

public class Singleton {
    private static Singleton instancia ;
    
    private Singleton(){
        
    }
    public static Singleton getIntance(){
        if(instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }
    
}
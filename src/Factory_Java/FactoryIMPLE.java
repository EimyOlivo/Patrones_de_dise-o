package Factory_Java;

public class FactoryIMPLE implements Factory{
    public final static String Agua = "agua";
    public final static String Campo = "campo";
    
    public Moto crearMoto(String tipo, int ruedas){
        switch(tipo){
            case Agua: return new MotoAgua(ruedas);
            case Campo: return new MotoCampo(ruedas);
            default:return null;
        }
    }
}

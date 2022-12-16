public class FactoryImposto {
    private static FactoryImposto unicoImposto;

    private FactoryImposto() {
    }
    
    public static FactoryImposto getFactory(){
        if(unicoImposto == null) unicoImposto = new FactoryImposto();
        return unicoImposto;
    }

    public Imposto getImposto(String tipoImposto, double valor){
        if(tipoImposto.equals("ICMS")) return new ICMS(valor);
        if(tipoImposto.equals("IPI")) return new IPI(valor);
        return null;
    }
}

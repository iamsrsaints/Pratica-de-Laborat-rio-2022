public class App {
    public static void main(String[] args){
        CalcularImposto calculadora = new CalcularImposto();
        FactoryImposto factoryImposto = FactoryImposto.getFactory();

        Imposto imposto;
        imposto = factoryImposto.getImposto("ICMS", 15);
        System.out.println("O ICMS É = " + calculadora.calcular(imposto));
        imposto = factoryImposto.getImposto("IPI", 15);
        System.out.println("O IPI É = " + calculadora.calcular(imposto.getValor()));
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        FactoryPessoa factory = FactoryPessoa.getFactory();
        factory.getPessoa("Paula","F");
        factory.getPessoa("Gabriel", "M");
    }
}

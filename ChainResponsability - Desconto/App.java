public class App {
    public static void main(String[] args) throws Exception {
        Gestor gerente = new Gerente(diretor);
        Gestor diretor = new Diretor(vicePresidente);
        Gestor vicePresidente = new VicePresidente(null);

        RequisiçãoCompra requisiçãoCompra = new RequisiçãoCompra(620.0,"Computador");
        gerente.processarCompra(requisiçãoCompra);
    }
}

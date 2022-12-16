public class Gerente extends Gestor {

    public Gerente(String cargo, Gestor sucessor, double limite) {
        super(cargo, sucessor, limite);
    }
    

    public Gerente(Gestor sucessor) {
        super("Gerente", sucessor, 650.0);
    }
}

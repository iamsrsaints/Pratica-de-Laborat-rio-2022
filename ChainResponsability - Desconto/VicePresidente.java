public class VicePresidente extends Gestor {

    public VicePresidente(String cargo, Gestor sucessor, double limite) {
        super(cargo, sucessor, limite);
    }
    public VicePresidente(Gestor sucessor) {
        super("Vice-Presidente", sucessor, 4000.0);
    }
}

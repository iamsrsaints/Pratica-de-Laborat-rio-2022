public class Diretor extends Gestor {

    public Diretor( String cargo, Gestor Sucessor,double limite) {
        super(cargo, Sucessor, limite);
    }
    
    public Diretor(Gestor Sucessor) {
        super("Diretor", Sucessor, 2450.0);
    }
}

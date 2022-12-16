public class Gestor {
    private String cargo;
    private Gestor sucessor;
    private double limite;

    public Gestor(String cargo, Gestor sucessor, double limite) {
        this.cargo = cargo;
        this.sucessor = sucessor;
        this.limite = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Gestor getSucessor() {
        return this.sucessor;
    }

    public void setSucessor(Gestor Sucessor) {
        this.sucessor = Sucessor;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void processarCompra(RequisiçãoCompra compra){
        if(compra.getValor()<=limite){
            System.out.println(cargo + "A compra foi aprovada!");
        }else{
            System.out.println("Infelizmente a compra ultrapassou os limites dos gestores");
        }
    }
}

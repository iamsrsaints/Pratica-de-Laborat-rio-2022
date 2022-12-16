public class IPI extends Imposto implements I_imposto {

    public IPI(double valor) {
        super.setValor(valor);
    }

    @Override
    public double calcular() {
        return getValor() * 0.2;
    }
}

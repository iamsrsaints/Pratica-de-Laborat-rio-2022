public class ICMS extends Imposto implements I_imposto {

    public ICMS(double valor) {
        super.setValor(valor);
    }

    @Override
    public double calcular() {
        return getValor() * 0.6;
    }
}

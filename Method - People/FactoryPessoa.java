public class FactoryPessoa {
    private static FactoryPessoa unicaFabrica;

    private FactoryPessoa() {
    }

    //Singleton
    public static FactoryPessoa getFactory(){
        if(unicaFabrica == null) {
            unicaFabrica = new FactoryPessoa();
        }
        return unicaFabrica;
    }

    public Pessoa getPessoa(String nome, String sexo){
        if(sexo.equals("F")) {
            return new Mulher(nome);
        } else if(sexo.equals("M")) {
            return new Homem(nome);
        } else {
            return null;
        }
    }
}

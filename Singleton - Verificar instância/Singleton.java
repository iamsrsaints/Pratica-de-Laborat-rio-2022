public class Singleton {
    private static Singleton instance = null;

    public static Singleton getSingleton(){
        if(instance == null){
            instance = new Singleton();
            System.out.println("Foi criada uma nova instaância!");
        }else{
            System.out.println("Já existe uma instância!");
        }
        return instance;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Singleton.getSingleton();
        Singleton.getSingleton();
        Singleton singleton = Singleton.getSingleton();
        singleton.getSingleton();
    }
}

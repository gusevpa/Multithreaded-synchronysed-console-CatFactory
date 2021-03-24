public class Main {
    public static void main(String[] args){
        for (int i = 0; i < 3; i++){
            new Thread(new CatFactory(i+1)).start();
        }
    }
}

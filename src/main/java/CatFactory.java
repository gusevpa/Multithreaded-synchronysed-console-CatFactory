public class CatFactory extends Thread{
   private int COUNT;
    {
        COUNT = 10;
    }

    @Override
    public void run() {
        int i = COUNT;
        while (i > 0){
            new Cat();
            i--;
        }
    }
}

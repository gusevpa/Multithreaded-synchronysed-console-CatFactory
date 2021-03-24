public class CatFactory implements Runnable{
   private int COUNT;
   private int NUMBER;
    {
        COUNT = 10;
    }

    public CatFactory(int i) {
        NUMBER = i;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < COUNT){
            new Cat(NUMBER +"." + i);
            i++;
        }
    }
}

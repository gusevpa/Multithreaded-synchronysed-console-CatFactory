public class CatFactory implements Runnable{
   private int COUNT;
   private int NUMBER;
    public CatFactory(int CAT_QUANTITY, int THREAD_NUMBER) {
        COUNT = CAT_QUANTITY;
        NUMBER = THREAD_NUMBER;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < COUNT){
            new Cat(NUMBER +"." + (i+1));
            i++;
        }
    }
}

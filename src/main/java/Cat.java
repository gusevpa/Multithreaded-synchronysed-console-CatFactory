public class Cat {
    {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EnumSingleton.INSTANCE.doWork();
    }
}

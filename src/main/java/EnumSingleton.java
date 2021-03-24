public enum EnumSingleton {
    INSTANCE;
    private int NUMBER = 1;
    public synchronized void doWork(String s){
        System.out.println("Enum " + (NUMBER++) + " from " + s + " cat");
    }
}

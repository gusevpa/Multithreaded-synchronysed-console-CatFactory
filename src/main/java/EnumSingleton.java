public enum EnumSingleton {
    INSTANCE;
    private int NUMBER = 1;
    public synchronized void doWork(){
        System.out.println("Enum " + (NUMBER++));
    }
}

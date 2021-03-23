public enum EnumSingleton {
    INSTANCE;
    private int NUMBER = 1;
    public void doWork(){
        System.out.println("Enum " + (NUMBER++));
    }
}

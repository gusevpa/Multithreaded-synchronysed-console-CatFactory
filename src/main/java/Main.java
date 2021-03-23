import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Thread> catList = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            catList.add(new CatFactory());
        }
        for (Thread j : catList){
            j.start();
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        int threadsNumber = 0;
        int catQuantity = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество потоков:");
        try {
            threadsNumber = Integer.parseInt(reader.readLine());
        }catch (Exception e){}

        System.out.println("Введите количество котов в каждом потоке:");
        try {
            catQuantity = Integer.parseInt(reader.readLine());
        }catch (Exception e){}

        if(threadsNumber == 0 || catQuantity == 0){
            System.out.println("Одна из введенных величин некорректна. \nФабрика котиков будет запущена с аргументами по умолчанию (5 и 5). \nНаслаждайтесь.");
            threadsNumber = 5;
            catQuantity = 5;
        } else {
            System.out.println("Фабрика котиков будет запущена с аргументами (" + threadsNumber + " и " + catQuantity + "). \nНаслаждайтесь.");
        }

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < threadsNumber; i++){
            new Thread(new CatFactory(catQuantity,i+1)).start();
        }
    }
}

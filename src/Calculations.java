public class Calculations implements  Runnable{//lub możemy też zaimplementować interfejs Runnable zamiast rozszerzać klasę thread "implements Runnable"
    @Override
    public void run() {
        for (int i = 0; i<=10; i++){
            System.out.println(i + ". ID: " +  Thread.currentThread().getId());
        }
    }
}

import java.util.concurrent.CompletableFuture;

public class VenkatSample {
    public static void main(String[] args) {
        System.out.println(" main "+Thread.currentThread());
        createCompleteableFuture().thenAccept((data)-> printIt(data));
    }


    public static CompletableFuture<Integer> createCompleteableFuture() {
        System.out.println(" createCompleteableFuture "+Thread.currentThread());
        return CompletableFuture.supplyAsync(()->computeAsync());

    }

    public static Integer computeAsync() {
        System.out.println(" compute "+Thread.currentThread());
        return 2;
    }

    public static void printIt(Integer data){
        System.out.println(" printIt "+Thread.currentThread());
    }
}

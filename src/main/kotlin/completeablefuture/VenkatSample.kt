package completeablefuture

import java.util.concurrent.CompletableFuture

fun createCompleteableFuture(): CompletableFuture<Int> {
    println(" createCompleteableFuture ${Thread.currentThread()}")
    return CompletableFuture.supplyAsync { computeAsync() }
}

fun computeAsync(): Int {
    return 2
}


fun main(args: Array<String>) {
    print("main ${Thread.currentThread()}")
    createCompleteableFuture().thenAccept { data -> printIt(data) }

}

fun printIt(data: Int?) {
    println("printIt ${Thread.currentThread()}")
    print(data)
}

import kotlin.random.Random

fun main(args: Array<String>) {
    println("Введите количество философов за круглым столом:")
    val countPhilosophers = readln().toInt()

    val philosophers = ArrayList<Philosopher>()
    val forks = ArrayList<Fork>()

    for (i in 0..< countPhilosophers){
        philosophers.add(Philosopher(i))
        forks.add(Fork(i))
    }

    philosophers.shuffle(Random)

    for (i in 0 ..< countPhilosophers){
        philosophers[i].takeFork(forks)
    }
}
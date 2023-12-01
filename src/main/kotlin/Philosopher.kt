import kotlin.random.Random

class Philosopher (val id : Int) {
    public fun takeFork(forks : ArrayList<Fork>){
        val isRight = Random.nextBoolean()

        val right = id % forks.size
        val left = (id + 1) % forks.size

        if (!forks[right].isChosen && isRight){
            forks[right].isChosen = true
            println("Филосов ${id + 1} взял вилку справа и обедает")
            return
        }
        else if (!forks[left].isChosen){
            forks[left].isChosen = true
            println("Филосов ${id + 1} взял вилку слева и обедает")
            return
        }

        if (!forks[left].isChosen && !isRight){
            forks[left].isChosen = true
            println("Филосов ${id + 1} взял вилку слева и обедает")
            return
        }
        else if (!forks[right].isChosen){
            forks[right].isChosen = true
            println("Филосов ${id + 1} взял вилку справа и обедает")
            return
        }
        println("Филосов ${id + 1} думает")
    }
}
import model.Job

class RoundRobin(private var queue: List<Job>) {
    private var iterator: Iterator<Job>
    init {
        iterator = queue.iterator()
    }

    operator fun next(): Job {
        if (!iterator.hasNext()) {
            iterator = queue.iterator()
        }
        return iterator.next()
    }

}
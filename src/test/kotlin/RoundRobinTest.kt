import junit.framework.TestCase
import model.Job
import model.JobImpl

class RoundRobinTest : TestCase() {
    var items: MutableList<Job> = ArrayList()
    var round: RoundRobin? = null

    fun testOne() {
        items.add(JobImpl(1, 1))
        round = RoundRobin(items)
        assertEquals(JobImpl(1,1), round!!.next())
        assertEquals(JobImpl(1,1), round!!.next())
    }

    fun testTwo() {
        items.add(JobImpl(1, 1))
        items.add(JobImpl(1, 1))
        round = RoundRobin(items)
        assertEquals(JobImpl(1,1), round!!.next().cost)
        assertEquals(JobImpl(2,2), round!!.next().cost)
        assertEquals(JobImpl(1,1), round!!.next().cost)
        assertEquals(JobImpl(2,2), round!!.next().cost)
    }

    fun testThree() {
        items.add(JobImpl(1, 1))
        items.add(JobImpl(2, 2))
        items.add(JobImpl(3, 3))
        round = RoundRobin(items)
        assertEquals(JobImpl(1,1), round!!.next().cost)
        assertEquals(JobImpl(2,2), round!!.next().cost)
        assertEquals(JobImpl(3,3), round!!.next().cost)
        assertEquals(JobImpl(1,1), round!!.next().cost)
        assertEquals(JobImpl(2,2), round!!.next().cost)
        assertEquals(JobImpl(3,3), round!!.next().cost)
    }
}
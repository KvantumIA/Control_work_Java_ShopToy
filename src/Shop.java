import java.util.List;
import java.util.PriorityQueue;

public class Shop {
    PriorityQueue<Toys> queue;
    private final DataService dataService = new DataService();

    public void shop() {
        this.queue = new PriorityQueue<Toys>();
    }

    public PriorityQueue<Toys> getQueue() {
        return queue;
    }

    public void setQueue(PriorityQueue<Toys> queue) {
        this.queue = queue;
    }



}

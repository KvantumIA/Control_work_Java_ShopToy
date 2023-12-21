import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Shop {
    private PriorityQueue<Toys> queue;
    private final DataService dataService = new DataService();

    public Shop() {
        this.queue = new PriorityQueue<>();
    }

    public PriorityQueue<Toys> getQueue() {
        return queue;
    }

    public void setQueue(PriorityQueue<Toys> queue) {
        this.queue = queue;
    }

    public void addShopQueue(List<Toys> toys) {
//        List<Toys> queueToy = new ArrayList<>(toys);
//        PriorityQueue<Toys> queue1 = new PriorityQueue<>();
//        for(Toys toy : queueToy){
//            this.queue.add(toy);
        this.queue.addAll(toys);

//        this.queue.addAll(queueToy);
    }

    public PriorityQueue<Toys> getToysQueue() {
        PriorityQueue<Toys> toysQueue = new PriorityQueue<>();
        toysQueue.addAll(queue);
        return toysQueue;
    }
}


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Shop {
    private PriorityQueue<Toys> queue;
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

    public PriorityQueue<Toys> addShopQueue() {
        List<Toys> queue2 = new ArrayList<>(dataService.getAllToys());
//        PriorityQueue<Toys> toysQueue= new PriorityQueue<Toys>();
        queue.addAll(queue2);
        return queue;
    }

//    public void getToysQueue() {
//        PriorityQueue<Toys> toysQueue = new PriorityQueue<>();
//        toysQueue.addAll(queue);
////        return toysQueue;
    }


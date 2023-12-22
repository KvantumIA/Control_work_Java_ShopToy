package Data;

import Data.DataService;
import Data.Toys;

import java.util.List;
import java.util.PriorityQueue;

public class Shop {
    private PriorityQueue<Toys> queue;

    public Shop() {
        this.queue = new PriorityQueue<>();
    }

    public PriorityQueue<Toys> getQueue() {
        return queue;
    }

    public void setQueue(PriorityQueue<Toys> queue) {
        this.queue = queue;
    }

    public void addShopQueue(List<Toys> s) {
        this.queue.addAll(s);
    }
}


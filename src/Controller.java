import java.util.*;

public class Controller {
    private final DataService dataService = new DataService();
    private final Shop shop = new Shop();

    public void createToy(String name, int count) {
        dataService.createToy(name, count);
    }

    public void getToys() {
        List<Toys> toys = dataService.getAllToys();
        for (Toys toy : toys) {
            System.out.println(toy);
        }
    }

//    public void createQueue() {
//        shop.addShopQueue();
////        System.out.println(shop.addShopQueue());
//    }
//    public void getQueue(){
//        PriorityQueue<Toys> queue = getToys();
//        for (Toys toys: queue){
//            System.out.println(toys);
//        }
//    }

    public PriorityQueue<Toys> createShopQueue() {
        List<Toys> queue2 = new ArrayList<>(dataService.getAllToys());
//        PriorityQueue<Toys> toysQueue= new PriorityQueue<Toys>();
        shop.queue.addAll(queue2);
        return shop.queue;
    }
    public void getToysQueue(){
//        PriorityQueue<Toys> toysQueue= new PriorityQueue<>();
//        toysQueue.addAll(shop.queue);
//        return toysQueue;
        PriorityQueue<Toys> queue = new PriorityQueue<>(shop.queue);
        for (Toys toys: queue){
            System.out.println(toys);
        }
    }
}


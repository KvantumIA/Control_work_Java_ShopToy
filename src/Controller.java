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

    public List<Toys> toysData() {
        return new ArrayList<>(dataService.getAllToys());
    }

    public void createQueue(List<Toys> toys) {
        shop.addShopQueue(toys);
    }

    public void getQueue() {
        PriorityQueue<Toys> queue = shop.getToysQueue();
        for (Toys toy : queue) {
            System.out.println(toy);
        }
    }
}


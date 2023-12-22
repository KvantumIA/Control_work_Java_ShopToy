package Controller;

import java.util.*;
import Data.DataService;
import Data.Files;
import Data.Shop;
import Data.Toys;


public class Controller {
    private final DataService dataService = new DataService();
    private final Shop shop = new Shop();
    private final Files files = new Files();

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
        PriorityQueue<Toys> queue = shop.getQueue();
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public Toys getToysRandom() {
        Random random = new Random();
        List<Toys> toys = files.saveAsList();
        int randomIndex = random.nextInt(toys.size());
        return toys.get(randomIndex);
    }

    public void readFile(){
        files.readFile();
    }
}


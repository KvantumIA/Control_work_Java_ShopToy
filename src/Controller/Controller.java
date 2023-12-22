package Controller;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public void createQueue() {
        List<Toys> toys = files.saveAsList();
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
        try {
            if (toys != null && !toys.isEmpty()) {
                int randomIndex = random.nextInt(toys.size());
                return toys.get(randomIndex);
            } else {
            throw new RuntimeException("Список игрушек пустой");
        }
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при выборе случайной игрушки", e);
        }
    }

        public void readFile () {
            files.readFile();
        }

        public void saveGift (Toys toy){
            files.saveGift(toy);
        }
    }


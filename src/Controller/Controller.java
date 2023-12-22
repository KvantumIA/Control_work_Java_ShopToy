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

    public void createQueue(List<Toys> toys) {
        shop.addShopQueue(toys);
    }

    public void getQueue() {
        PriorityQueue<Toys> queue = shop.getQueue();
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public String getToysRandom() {
        Random random = new Random();
        List<String> toys = files.saveAsList();
        int randomIndex = random.nextInt(toys.size());
        String toy = toys.get(randomIndex);
        String[] parts = toy.split(", ");
        String[] id = parts[0].split("=");
        String[] name = parts[1].split("=");
        String[] chans = parts[2].split("=");
        String[] chans2 = chans[1].split("%");
        return "ID = " + id[1] + ", Название =" + name[1] + ", Шанс на выпадение =" + chans2[0] + "%";
    }

    public void readFile() {
        files.readFile();
    }
}


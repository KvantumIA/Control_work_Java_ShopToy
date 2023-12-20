import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<Toys> toysList;

    public DataService() {
        this.toysList = new ArrayList<>();
    }

    public List<Toys> getToysList() {
        return toysList;
    }

    public void setToysList(List<Toys> toysList) {
        this.toysList = toysList;
    }
    private int getFreeId(){
        int lastId = 1;
        for (Toys toy: toysList) {
            lastId = ((Toy)toy).getToyId()+ 1;
        }
        return lastId;
    }
    public void createToy(String name, Integer count){
        int id = getFreeId();
        for (int i = 0; i < count; i++) {
            Toy toy = new Toy(name, count, id);
            toysList.add(toy);
            id += 1;
        }
    }
    public List<Toys> getAllToys(){
        List<Toys> toyList = new ArrayList<>();
        for (Toys toy: toysList) {
            toyList.add(toy);
        }
        return toyList;
    }

}

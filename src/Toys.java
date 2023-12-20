import java.util.List;

public abstract class Toys {
    private String Name;
    private Integer Count;

    public Toys(String name, int count) {
        Name = name;
        Count = count;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getCount() {
        return Count;
    }

    public void setCount(Integer count) {
        Count = count;
    }


    @Override
    public String toString() {
        return "Toys{" +
                "name='" + Name + '\'' +
                ", count=" + Count +
                '}';
    }
}

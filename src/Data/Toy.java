package Data;

public class Toy extends Toys implements Comparable<Toy> {
    private int toyId;

    public Toy(String name, Integer count, int id) {
        super(name, count);
        this.toyId = id;
    }

    public int getToyId() {
        return toyId;
    }

    public void setToyId(int toyId) {
        this.toyId = toyId;
    }

    @Override
    public String toString() {
        return "Data.Toy{" +
                "Data.Toys ID=" + toyId +
                ", Название = '" + getName() + '\'' +
                ", Шанс на выпадение = " + getCount() + "0%" +
                '}';
    }

    @Override
    public int compareTo(Toy other) {
        return Integer.compare(other.getCount(), this.getCount());
    }
}

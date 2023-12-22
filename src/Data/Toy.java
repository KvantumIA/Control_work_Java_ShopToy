package Data;

public class Toy extends Toys implements Comparable<Toy> {
    private int toyId;

    public Toy(String name, Integer chance, int id) {
        super(name, chance);
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
        return "Игрушка{" +
                "ID=" + toyId +
                ", Название = " + getName() +
                ", Шанс выпадение = " + getCount() + "%" +
                '}';
    }

    @Override
    public int compareTo(Toy other) {
        return Integer.compare(other.getCount(), this.getCount());
    }
}

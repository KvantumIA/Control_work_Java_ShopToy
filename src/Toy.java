public class Toy extends Toys {
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
        return "Toy{" +
                "Toys ID=" + toyId +
                ", name='" + getName() + '\'' +
                ", count=" + getCount() +
                '}';
    }
}

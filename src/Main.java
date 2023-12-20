public class Main {
    public static void main(String[] args) {
        Controller controller1 = new Controller();
        controller1.createToy("Робот", 2);
        controller1.getToys();

//        Controller controller2 = new Controller();
//        controller2.createToy("Кукла", 3);
//        controller2.getToys();

        controller1.createShopQueue();
        controller1.getToysQueue();
    }
}

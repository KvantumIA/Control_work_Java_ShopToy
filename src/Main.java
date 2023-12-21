import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Controller controller1 = new Controller();
        controller1.createToy("Робот", 2);
//        controller1.getToys();

//        Controller controller2 = new Controller();
//        controller2.createToy("Кукла", 3);
//        controller2.getToys();

//        List<Toys> q1 = controller1.toysData();
//        System.out.println(q1);

        controller1.createQueue(controller1.toysData());
        controller1.getQueue();
    }
}

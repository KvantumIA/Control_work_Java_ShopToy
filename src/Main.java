import Controller.MainMenu;
import Data.Files;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Controller.Controller controller1 = new Controller.Controller();
//        controller1.createToy("Робот", 2);
//        controller1.createToy("Кукла", 3);
//        controller1.createToy("Конструктор", 2);
//        controller1.createToy("Машинка", 6);

//        MainMenu menu = new MainMenu();
//        menu.start();

        Files files = new Files();
        System.out.println(files.saveAsList());
    }
}

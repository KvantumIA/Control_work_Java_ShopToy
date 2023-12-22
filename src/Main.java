import Controller.Controller;
import Controller.MainMenu;
import Data.Files;
import Data.Toy;
import Data.Toys;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Controller controller1 = new Controller();
//        Files files = new Files();
//        List<Toys> s = files.saveAsList();
//        for (Toys sd : s){
//            System.out.println(sd);
//        }

        MainMenu menu = new MainMenu();
        menu.start();

//        controller1.createQueue();
//        controller1.getQueue();
    }
}


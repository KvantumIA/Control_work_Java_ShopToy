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
        MainMenu menu = new MainMenu();
        menu.start();
    }
}


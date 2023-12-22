package Controller;

import Data.Files;

import java.util.Scanner;

public class MainMenu {
    private final Controller controller = new Controller();
    private final Files files = new Files();

    public void start() {
        System.out.println("Меню: \n" +
                "1. Добавить игрушку. \n" +
                "2. Записать в файл. \n" +
                "3. Вывести список игрушек.\n" +
                "4. Разыграть случайную игрушку. \n" +
                "5. Очистить список. \n" +
                "6. Выход.");
        System.out.print("Выберите пункт меню: ");
        Scanner scanner = new Scanner(System.in);
        int nameMenu = scanner.nextInt();
        switch (nameMenu) {
            case 1:
                Scanner scanner1 = new Scanner(System.in);
                System.out.print("Введите название игрушки: ");
                String name = scanner1.nextLine();
                System.out.print("Введите шанс выпадения игрушки: ");
                Scanner scanner2 = new Scanner(System.in);
                int count = scanner2.nextInt();
                controller.createToy(name, count);
                System.out.println("Игрушка добавлена");
                continueMenu();
                break;
            case 2:
                files.fileSave(controller.toysData());
                continueMenu();
                break;
            case 3:
                System.out.println("Список игрушек:");
                controller.readFile();
                continueMenu();
                break;
            case 4:
                System.out.println("Выпала игрушка : " + controller.getToysRandom());
                controller.saveGift(controller.getToysRandom());
                continueMenu();
                break;
            case 5:
                files.clearFile();
                System.out.println("Список очищен.");
                continueMenu();
                break;
            case 6:
                break;
            default:
                System.out.println("Вы ввели неверный пункт меню. Повторите.");
                start();
                break;
        }
    }

    public void continueMenu() {
        System.out.println("Меню: \n" +
                "1. Выйти в меню. \n" +
                "2. Выход из программы.");
        System.out.print("Выберите пункт меню: ");
        Scanner scanner = new Scanner(System.in);
        int nameMenu = scanner.nextInt();
        switch (nameMenu) {
            case 1:
                start();
                break;
            case 2:
                files.fileSave(controller.toysData());
                break;
            default:
                System.out.println("Вы ввели неверный пункт меню. Повторите.");
                start();
                break;
        }
    }
}
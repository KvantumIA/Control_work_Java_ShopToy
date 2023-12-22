package Controller;

import Data.Files;
import Data.Toys;

import java.util.Scanner;

public class MainMenu {
    private final Controller controller = new Controller();
    private final Files files = new Files();

    public void start() {
        System.out.println("\nМеню: \n" +
                "1. Добавить игрушку. \n" +
                "2. Записать в файл. \n" +
                "3. Вывести список игрушек.\n" +
                "4. Разыграть случайную игрушку. \n" +
                "5. Очистить список. \n" +
                "6. Удалить игрушку. \n" +
                "7. Выход.");
        System.out.print("\nВыберите пункт меню: ");
        Scanner scanner = new Scanner(System.in);
        int nameMenu = scanner.nextInt();
        switch (nameMenu) {
            case 1:
                System.out.println("\nВнимание! При создании нового списка игрушек, старый список удаляется!\n"); //не придумал как продолжить ID, при добавлении новой игрушки заново пишет
                System.out.print("Вы хотите продолжить? Напишите 1 - если Да, и 2 - если Нет: ");
                Scanner scanner1 = new Scanner(System.in);
                int num = 0;
                if (scanner1.hasNextInt()) {
                    num = scanner1.nextInt();
                } else {
                    System.out.println("Ошибка! Введите цифры.");
                }
                if (num == 1) {
                    files.clearFile();
                    controller.createToy();
                    System.out.println("Игрушка добавлена");
                    continueMenuCreateToy();
                } else {
                    start();
                }
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
                Toys toy = controller.getToysRandom();
                System.out.println("Выпала игрушка : " + toy);
                controller.saveGift(toy);
                files.delToy(toy);
                continueMenu();
                break;
            case 5:
                files.clearFile();
                System.out.println("Список очищен.");
                continueMenu();
                break;
            case 6:
                controller.delToy();
                System.out.println("Игрушка удалена.");
                continueMenu();
                break;
            case 7:
                break;
            default:
                System.out.println("Вы ввели неверный пункт меню. Повторите.");
                start();
                break;
        }
    }

    public void continueMenu() {
        System.out.println("Меню: \n" +
                "1. Назад в меню. \n" +
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

    public void continueMenuCreateToy() {
        System.out.println("Меню: \n" +
                "1. Добавить еще игрушку. \n" +
                "2. Назад в меню.");
        System.out.print("Выберите пункт меню: ");
        Scanner scanner = new Scanner(System.in);
        int nameMenu = scanner.nextInt();
        switch (nameMenu) {
            case 1:
                controller.createToy();
                System.out.println("Игрушка добавлена");
                continueMenuCreateToy();
                break;
            case 2:
                files.fileSave(controller.toysData());
                start();
                break;
            default:
                System.out.println("Вы ввели неверный пункт меню. Повторите.");
                start();
                break;
        }
    }
}
package Data;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Files {
    public void fileSave(List<Toys> toyData) {
        String path = "src/Files/ListToys.txt";
        try {
            File file = new File(path);
            if (file.createNewFile()) {
                writeToFile(path, toyData);
                System.out.println("Файл успешно создан и запись сохранена.");
            } else {
                writeToFile(path, toyData);
                System.out.println("В существующий файл добавлена запись.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Открыть несуществующий файл нельзя, ваш путь к файлу -> " + path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToFile(String path, List<Toys> toyData) {
        try (FileWriter fileWriter = new FileWriter(path, true)) {
            for (Toys toy : toyData) {
                fileWriter.write(String.valueOf(toy) + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFile() {
        String path = "src/Files/ListToys.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            int count = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println("Запись " + count + ": " + line);
                count += 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    public List<Toys> saveAsList(){
//        String path = "src/Files/ListToys.txt";
//        List<Toys> saveAsList = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                saveAsList.add(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return saveAsList;
//    }

//    public List<Toys> saveAsList(){
//        String path = "src/Files/ListToys.txt";
//        List<Toys> saveAsList = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split(", "); // Предположим, что данные разделены запятой
//                System.out.println(Arrays.toString(parts));
//                int id = Integer.parseInt(parts[0].split("=")[1].trim());
//                String name = parts[1].split("=")[1].trim();
//                int chance = Integer.parseInt(parts[2].split("=")[1].replace("%", "").trim());
//                System.out.println(chance);
//                Toys toy = new Toy(name, id, chance);
//                saveAsList.add(toy);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return saveAsList;
//    }

    public List<Toys> saveAsList(){
        String path = "src/Files/ListToys.txt";
        List<Toys> saveAsList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", "); // Предположим, что данные разделены запятой
                System.out.println(Arrays.toString(parts));
                int id = Integer.parseInt(parts[0].split("=")[1].trim());
                String name = parts[1].split("=")[1].trim();
                int chance = Integer.parseInt(parts[2].split("=")[1].replace("%", "").trim());
                System.out.println(chance);
                Toys toy = new Toy(name, id, chance);
                saveAsList.add(toy);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return saveAsList;
    }
}

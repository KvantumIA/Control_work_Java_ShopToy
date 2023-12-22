package Data;

import java.io.*;
import java.util.*;

public class Files {
    public void fileSave(List<Toys> toyData) {
        String path = "src/Files/ListToys.txt";
        String path2 = "src/Files/ReadToys.txt";
        try {
            File file = new File(path);
            if (file.createNewFile()) {
                writeToFile(path, toyData);
                writeToFile2(path2, toyData);
                System.out.println("Файл успешно создан и игрушка добавлена.");
            } else {
                writeToFile(path, toyData);
                writeToFile2(path2, toyData);
                System.out.println("Игрушки сохранены.");
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
                fileWriter.write(toy + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToFile2(String path2, List<Toys> toyData) {
        try (FileWriter fileWriter2 = new FileWriter(path2, true)) {
            Set<String> oneToys = new HashSet<>();
            for (Toys toy : toyData) {
                if (oneToys.add(toy.getName())) {
                    fileWriter2.write(toy + "\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFile() {
        String path = "src/Files/ReadToys.txt";
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

    public List<String> saveAsList() {
        String path = "src/Files/ListToys.txt";
        List<String> saveAsList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                saveAsList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return saveAsList;
    }
}

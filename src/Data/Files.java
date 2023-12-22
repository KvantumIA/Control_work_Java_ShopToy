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

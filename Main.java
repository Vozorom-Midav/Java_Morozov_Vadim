import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Dell P33", 2020, "black", "IPS", 18.5, "Intel", 8, 512, "Windows 10");
        Notebook notebook2 = new Notebook("Samsung ST22", 2018, "white", "VA", 20.6, "Intel", 8, 1024, "Windows 8");
        Notebook notebook3 = new Notebook("Huawei R6", 2023, "silver", "IPS", 16.7, "AMD", 16, 512, "Windows 11");
        Notebook notebook4 = new Notebook("Dell S17", 2022, "red", "IPS", 20.6, "AMD", 8, 512, "Linux Ubuntu");

        Set<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(notebook1);
        notebookSet.add(notebook2);
        notebookSet.add(notebook3);
        notebookSet.add(notebook4);

        Map<Integer, String> mapsFilter = new HashMap<>();

        mapsFilter.put(1, "Объем оперативной памяти");
        mapsFilter.put(2, "Объем накопителя");
        mapsFilter.put(3, "Операционная система");
        mapsFilter.put(4, "Цвет");
        mapsFilter.put(5, "Диагональ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите желаемые характеристики");
        System.out.println("Объем оперативной памяти: ");
        int ramMemory = scanner.nextInt();
        System.out.println("Объем накопителя: ");
        int storMemory = scanner.nextInt();
        System.out.println("диагональ");
        double diag = scanner.nextDouble();
        for(Notebook note: notebookSet) {
            if ((note.getMemorySize() >= ramMemory) && (note.getStorageSize() >= storMemory)  && note.getDiagonal() >= diag) {
                System.out.println(note.toString());
            }
        }
        scanner.close();
    }
}

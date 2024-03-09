import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Dell P33", 2020, "black", "IPS", 18, "Intel", 8, 512, "Windows 10");
        Notebook notebook2 = new Notebook("Samsung ST22", 2018, "white", "VA", 20, "Intel", 8, 1024, "Windows 8");
        Notebook notebook3 = new Notebook("Huawei R6", 2023, "silver", "IPS", 16, "AMD", 16, 512, "Windows 11");
        Notebook notebook4 = new Notebook("Dell S17", 2022, "red", "IPS", 20, "AMD", 8, 512, "Linux Ubuntu");

        Set<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(notebook1);
        notebookSet.add(notebook2);
        notebookSet.add(notebook3);
        notebookSet.add(notebook4);
    }
}

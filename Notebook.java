import java.util.Objects;

/**
 * Notebook
 */

 /*
  * -Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в
    java.
    -Создать множество ноутбуков.
    -Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и
    выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
    “Введите цифру, соответствующую необходимому критерию: 1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …
    -Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации
    можно также в Map.
    -Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
  */

public class Notebook {
    //Название ноутбука
    private String brandName;
    //Год выхода ноутбука
    private int releaseYear;
    //Цвет ноутбука
    private String color;
    //Тип матрицы
    private String matrixType;
    //Диагональ экрана
    private int diagonal;
    //Модель процессора
    private String processorName;
    //Объем RAM
    private int memorySize;
    //Объем ЖД
    private int storageSize;
    //Операционная система
    private String operatingSystem;

    public Notebook(String brandName, int releaseYear, String color, String matrixType, int diagonal, String processorName, int memorySize, int storageSize, String operatingSystem){
        this.brandName = brandName;
        this.releaseYear = releaseYear;
        this.color = color;
        this.matrixType = matrixType;
        this.diagonal = diagonal;
        this.processorName = processorName;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.operatingSystem = operatingSystem;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }
   
    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
   
    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType){
        this.matrixType = matrixType;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal){
        this.diagonal = diagonal;
    }
   
    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName){
        this.processorName = processorName;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize){
        this.memorySize = memorySize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize){
        this.storageSize = storageSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString()
    {
        return "Notebook {" +
                "Модель ноутбука = '" + brandName + '\'' +
                ", Год выпуска = '" + releaseYear + '\'' +
                ", Цвет = '" + color + '\'' +
                ", Тип матрицы = '" + matrixType + '\'' +
                ", Размер диагонали = '" + diagonal + '\'' +
                ", Название процессора = '" + processorName + '\'' +
                ", Объем оперативной памяти = '" + memorySize + '\'' +
                ", Объем жесткого диска = '" + storageSize + '\'' +
                ", Операционная система = '" + operatingSystem + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Notebook notebook = (Notebook) obj;
        return notebook.brandName.equals(brandName) &&
                notebook.releaseYear == releaseYear &&
                notebook.color.equals(color) &&
                notebook.matrixType.equals(matrixType) &&
                notebook.diagonal == diagonal &&
                notebook.processorName.equals(processorName) &&
                notebook.memorySize == memorySize &&
                notebook.storageSize == storageSize &&
                notebook.operatingSystem.equals(operatingSystem);
    }

    @Override
    public int hashCode(){
        return Objects.hash(brandName, releaseYear, color, matrixType, diagonal, processorName, memorySize, storageSize, operatingSystem);
    }
}

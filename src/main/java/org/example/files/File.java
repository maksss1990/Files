package org.example.files;

public abstract class File {
    private String name;
    private long size;

    protected File(String name, long size) {
        setName(name);
        setSize(size);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Имя файла не может быть пустым");
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        if (size < 0)
            throw new IllegalArgumentException("Размер файла не может быть отрицательным");
        this.size = size;
    }

    public abstract String getDetails();

    public static void printAll(File[] files) {
        System.out.println("        File name       |       Size      | Details");
        System.out.println("------------------------+-----------------+-------------------------");

        for (File f : files) {

            System.out.printf("%-24s|%17d|%s%n", f.getName(), f.getSize(), f.getDetails());
        }
    }
}

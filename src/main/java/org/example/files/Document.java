package org.example.files;

import org.example.enums.FileFormat;

public class Document extends File {
    private FileFormat format;
    private int pageCount;

    public Document(String name, long size, FileFormat format, int pageCount) {
        super(name, size);
        this.format = validateFormat(format);
        this.pageCount = validatePageCount(pageCount);
    }

    public FileFormat getFormat() {
        return format;
    }

    public void setFormat(FileFormat format) {
        this.format = validateFormat(format);
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = validatePageCount(pageCount);
    }

    private FileFormat validateFormat(FileFormat format) {
        if (format == null)
            throw new IllegalArgumentException("Формат не может быть null");

        return format;
    }

    private int validatePageCount(int pageCount) {
        if (pageCount < 1)
            throw new IllegalArgumentException("Количество страниц должно быть > 0");

        return pageCount;
    }

    @Override
    public String getDetails() {
        return format + ", " + pageCount + " pages";
    }
}

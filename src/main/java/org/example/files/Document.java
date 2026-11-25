package org.example.files;

import org.example.enums.FileFormat;

public class Document extends File {
    private FileFormat format;
    private int pageCount;

    public Document(String name, long size, FileFormat format, int pageCount) {
        super(name, size);
        setFormat(format);
        setPageCount(pageCount);
    }

    public FileFormat getFormat() {
        return format;
    }

    public void setFormat(FileFormat format) {
        if (format == null)
            throw new IllegalArgumentException("Формат не может быть null");

        this.format = format;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount < 1) throw new IllegalArgumentException("Количество страниц должно быть > 0");
        this.pageCount = pageCount;
    }

    @Override
    public String getDetails() {
        return format + ", " + pageCount + " pages";
    }
}

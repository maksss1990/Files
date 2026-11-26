package org.example.files;

import org.example.enums.FileFormat;
import org.example.utils.ImageSize;

public class Image extends File {
    private FileFormat format;
    private ImageSize imageSize;

    public Image(String name, long size, FileFormat format, ImageSize imageSize) {
        super(name, size);
        this.format = validateFormat(format);
        this.imageSize = validateImageSize(imageSize);
    }

    public FileFormat getFormat() {
        return format;
    }

    public void setFormat(FileFormat format) {
        this.format = validateFormat(format);
    }

    public ImageSize getImageSize() {
        return imageSize;
    }

    public void setImageSize(ImageSize imageSize) {
        this.imageSize = validateImageSize(imageSize);
    }

    private FileFormat validateFormat(FileFormat format) {
        if (format == null)
            throw new IllegalArgumentException("Формат не может быть null");

        return format;
    }

    private ImageSize validateImageSize(ImageSize imageSize) {
        if (imageSize == null)
            throw new IllegalArgumentException("Размер изображения не может быть null");

        return imageSize;
    }

    @Override
    public String getDetails() {
        return "image, " + imageSize;
    }
}

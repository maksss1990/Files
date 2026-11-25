package org.example.files;

import org.example.enums.FileFormat;
import org.example.utils.ImageSize;

public class Image extends File {
    private FileFormat format;
    private ImageSize imageSize;

    public Image(String name, long size, FileFormat format, ImageSize imageSize) {
        super(name, size);
        setFormat(format);
        setImageSize(imageSize);
    }

    public FileFormat getFormat() {
        return format;
    }

    public void setFormat(FileFormat format) {
        if (format == null)
            throw new IllegalArgumentException("Формат не может быть null");

        this.format = format;
    }

    public ImageSize getImageSize() {
        return imageSize;
    }

    public void setImageSize(ImageSize imageSize) {
        if (imageSize == null)
            throw new IllegalArgumentException("Размер изображения не может быть null");

        this.imageSize = imageSize;
    }
}

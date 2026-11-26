package org.example.files;

import org.example.enums.FileFormat;
import org.example.utils.Duration;
import org.example.utils.ImageSize;

public class VideoFile extends MediaFile {
    private ImageSize imageSize;

    public VideoFile(String name, long size, FileFormat format, String contentDescription, Duration duration, ImageSize imageSize) {
        super(name, size, format, contentDescription, duration);
        this.imageSize = validateImageSize(imageSize);;
    }

    public ImageSize getImageSize() {
        return imageSize;
    }

    public void setImageSize(ImageSize imageSize) {
        this.imageSize = validateImageSize(imageSize);
    }

    private ImageSize validateImageSize(ImageSize imageSize) {
        if (imageSize == null)
            throw new IllegalArgumentException("Размер изображения не может быть null");

        return imageSize;
    }

    @Override
    public String getDetails() {
        return "video, " + getContentDescription() + ", " + getDuration() + ", " + imageSize;
    }
}

package org.example.files;

import org.example.enums.FileFormat;
import org.example.utils.Duration;

public class MediaFile extends File {
    private FileFormat format;
    private String contentDescription;
    private Duration duration;

    public MediaFile(String name, long size, FileFormat format, String contentDescription, Duration duration) {
        super(name, size);
        setFormat(format);
        setContentDescription(contentDescription);
        setDuration(duration);
    }

    public FileFormat getFormat() {
        return format;
    }

    public void setFormat(FileFormat format) {
        if (format == null)
            throw new IllegalArgumentException("Формат не может быть null");

        this.format = format;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        if (contentDescription == null) throw new IllegalArgumentException("Описание контента не может быть null");
        this.contentDescription = contentDescription;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        if (duration == null) throw new IllegalArgumentException("Длительность не может быть null");
        this.duration = duration;
    }
}

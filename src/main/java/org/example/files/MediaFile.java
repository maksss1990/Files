package org.example.files;

import org.example.enums.FileFormat;
import org.example.utils.Duration;

public class MediaFile extends File {
    private FileFormat format;
    private String contentDescription;
    private Duration duration;

    public MediaFile(String name, long size, FileFormat format, String contentDescription, Duration duration) {
        super(name, size);
        this.format = validateFormat(format);
        this.contentDescription = validateContentDescription(contentDescription);
        this.duration = validateDuration(duration);
    }

    public FileFormat getFormat() {
        return format;
    }

    public void setFormat(FileFormat format) {
        this.format = validateFormat(format);
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = validateContentDescription(contentDescription);
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = validateDuration(duration);
    }

    private Duration validateDuration(Duration duration) {
        if (duration == null)
            throw new IllegalArgumentException("Длительность не может быть null");

        return duration;
    }

    private String validateContentDescription(String contentDescription) {
        if (contentDescription == null || contentDescription.isBlank())
            throw new IllegalArgumentException("Описание контента не может быть null");

        return contentDescription;
    }

    private FileFormat validateFormat(FileFormat format) {
        if (format == null)
            throw new IllegalArgumentException("Формат не может быть null");

        return format;
    }

    @Override
    public String getDetails() {
        return "audio, " + contentDescription + ", " + duration;
    }
}

package org.example.enums;

public enum FileFormat {
    DOCX, PDF, TXT,
    PNG, JPG, JPEG, GIF,
    MP3, WAV, FLAC,
    MP4, AVI, MKV;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}

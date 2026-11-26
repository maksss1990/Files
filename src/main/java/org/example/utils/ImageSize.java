package org.example.utils;

public class ImageSize {
    private int width;
    private int height;

    public ImageSize(int width, int height) {
        this.width = validateWidth(width);
        this.height = validateHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = validateWidth(width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = validateHeight(height);
    }

    private int validateWidth(int width) {
        if (width <= 0)
            throw new IllegalArgumentException("Ширина должна быть > 0");

        return width;
    }

    private int validateHeight(int height) {
        if (height <= 0)
            throw new IllegalArgumentException("Высота должна быть > 0");

        return height;
    }

    @Override
    public String toString() {
        return width + "x" + height;
    }
}

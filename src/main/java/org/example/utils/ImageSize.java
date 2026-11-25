package org.example.utils;

public class ImageSize {
    private int width;
    private int height;

    public ImageSize(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) throw new IllegalArgumentException("Ширина должна быть > 0");
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) throw new IllegalArgumentException("Высота должна быть > 0");
        this.height = height;
    }

    @Override
    public String toString() {
        return width + "x" + height;
    }
}

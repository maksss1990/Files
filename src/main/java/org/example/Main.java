package org.example;


import org.example.files.*;
import org.example.utils.Duration;
import org.example.utils.ImageSize;

import static org.example.enums.FileFormat.*;

public class Main {
    public static void main(String[] args) {
        File[] files = new File[] {
                new Document("j110.docx", 23212, DOCX, 2),
                new Image("spb-map.png", 1703527, PNG, new ImageSize(1024, 3072)),
                new MediaFile("06.mp3", 7893454, MP3, "song", new Duration(0, 5, 28)),
                new VideoFile("BackToTheFuture1.avi", 1470984192L, AVI, "Back to the future I, 1985",
                        new Duration(1, 48, 8), new ImageSize(640, 352))
        };

        File.printAll(files);

        VideoFile[] videos = new VideoFile[] {
                new VideoFile("1.mp4", 104_857_600, MP4, "Закат", new Duration(0, 2, 30), new ImageSize(1920, 1080)),
                new VideoFile("2.mkv", 419_430_400, MKV, "Лыжи", new Duration(0, 15, 0), new ImageSize(1280, 720))
        };

        System.out.println("\n=== Только видеофайлы ===");

        File.printAll(videos);
    }
}
package com.example.task12;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

@Component
public class FileReader {
    private final String pathOfTheFirstFile = "C:\\task12\\src\\main\\java\\com\\example\\task12\\1.txt";
    private final String pathOfTheSecondFile = "C:\\task12\\src\\main\\java\\com\\example\\task12\\2.txt";

    @PostConstruct
    private void saveHash() throws FileNotFoundException {
        File file = new File(pathOfTheFirstFile);
        Scanner scanner = new Scanner(file);
        String str = scanner.nextLine();
        File file2 = new File(pathOfTheSecondFile);
        int hash = str.hashCode();
        scanner.close();
        PrintWriter printWriter = new PrintWriter(file2);
        printWriter.println(hash);
        printWriter.flush();
        printWriter.close();
    }

    @PreDestroy
    private void deleteInputFile() {
        if (Files.exists(Path.of(pathOfTheFirstFile))) {
            try {
                Files.delete(Path.of(pathOfTheFirstFile));
                System.out.println("File deleted");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

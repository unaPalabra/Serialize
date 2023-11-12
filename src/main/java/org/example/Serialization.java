package org.example;

import org.example.dto.StudentData;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Serialization {
    public static void main(String[] args) throws IOException {
        StudentData studentData = new StudentData();
        studentData.setFirstName("Егор");
        studentData.setLastName("Летов");
        studentData.setGrade(4);

        try (ObjectInputStream objectOutputStream = new ObjectInputStream(Files.newOutputStream(Paths.get("C:\\Users\\Don_Aleut\\Desktop\\java_test\\egor.data")))) {
            objectOutputStream.writeObject(studentData);
            objectOutputStream.flush();
        }
    }
}

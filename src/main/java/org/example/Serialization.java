package org.example;

import org.example.dto.StudentData;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StudentData studentData = new StudentData();
        studentData.setFirstName("Егор");
        studentData.setLastName("Летов");
        studentData.setGrade(4);

//        сериализация (запись данных в файл на рабочем столе)
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get("C:\\Users\\Don_Aleut\\Desktop\\java_test\\egor.data")))) {
            objectOutputStream.writeObject(studentData);
            objectOutputStream.flush();
        }

//        десериализация (восстановление данных из файла)
        ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get("C:\\Users\\Don_Aleut\\Desktop\\java_test\\egor.data")));
        StudentData o = (StudentData) objectInputStream.readObject();
        System.out.println(o.getFirstName());
        System.out.println(o.getLastName());
        System.out.println(o.getGrade());


    }
}

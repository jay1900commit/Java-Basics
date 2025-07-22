package AdvanceTopics.SerializationAndDeserialization;

import java.io.*;

public class DeSerialzationDemo {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\user\\Downloads\\serialization file\\employee.ser";

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath );
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            Employee e = (Employee)ois.readObject();
            System.out.println(e.id);
            System.out.println(e.name);
            fileInputStream.close();
            ois.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

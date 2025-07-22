package AdvanceTopics.SerializationAndDeserialization;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.id = 1;
        e.name = "Amit Sharma";

        String fileName = "C:\\Users\\user\\Downloads\\serialization file\\employee.ser";

        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream outputStream = new ObjectOutputStream(file);
            outputStream.writeObject(e);

            file.close();
            outputStream.close();

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

}

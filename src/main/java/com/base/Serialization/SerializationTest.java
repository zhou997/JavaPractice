package com.base.Serialization;

import java.io.*;

public class SerializationTest implements Serializable{
    public static int s = 10;
    public String name = "zhou";
    public transient String sex = "man";

    public static void main(String[] args) {
        SerializationTest st1 = new SerializationTest();
        SerializationTest st2;

        try{
            FileOutputStream fos = new FileOutputStream("st");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(st1);
            oos.close();
            fos.close();
            System.out.println("Serialization: name = " + st1.name);
            System.out.println("Serialization: sex = " + st1.sex);
            System.out.println("Serialization: s = " + s);
            s = ++s;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            FileInputStream fis = new FileInputStream("st");
            ObjectInputStream ois = new ObjectInputStream(fis);
            st2 = (SerializationTest) ois.readObject();
            System.out.println("Deserialization: name = " + st2.name);
            System.out.println("Deserialization: sex = " + st2.sex);
            System.out.println("Deserialization: s = " + s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

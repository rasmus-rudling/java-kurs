package org.rasmus;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        try (FileChannel inChannel = FileChannel.open(Paths.get("src/input.txt"), StandardOpenOption.READ);
             FileChannel outChannel = FileChannel.open(Paths.get("src/output.txt"),
                     StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while (inChannel.read(buffer) != -1) {
                buffer.flip(); // Växla från skrivläge till läsläge
                outChannel.write(buffer);
                buffer.clear(); // Töm bufferten för nästa läsning
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



















//        try (FileInputStream inputStream = new FileInputStream("src/input.txt");
//             FileOutputStream outputStream = new FileOutputStream("src/output.txt")) {
//            byte[] buffer = new byte[1024];
//            int bytesead = inputStream.read(buffer);
//
//            while (bytesead != -1) {
//                outputStream.write(buffer, 0, bytesead);
//                bytesead = inputStream.read(buffer);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // NO.2 med kanaler och buffertar (java.nio)
//        try (FileChannel inChannel = FileChannel.open(Paths.get("input.txt"), StandardOpenOption.EAD);
//             FileChannel outChannel = FileChannel.open(Paths.get("output.txt"),
//                     StandardOpenOption.WTE, StandardOpenOption.CEATE)) {
//            ByteBuffer buffer = ByteBuffer.allocate(1024);
//            while (inChannel.read(buffer) != -1) {
//                buffer.flip(); // Växla från skrivläge till läsläge
//                outChannel.write(buffer);
//                buffer.clear(); // Töm bufferten för nästa läsning
//            }
//        }


//        try {
//            new Thread(() -> {
//                // Kod som kan kasta undantag
//                throw new RuntimeException("Thread exception");
//            }).start();
//        } catch (Exception e) {
//            // Detta kommer INTE att fånga undantaget i tråden!
//            System.err.println("Caught: " + e.getMessage());
//        }
//
//        // Bättre - hantera undantag i tråden
//        Thread thread = new Thread(() -> {
//            try {
//                // Kod som kan kasta undantag
//                throw new RuntimeException("Thread exception");
//            } catch (Exception e) {
//                System.err.println("Thread exception caught: " + e.getMessage());
//            }
//        });
//        thread.start();


//        BankAccount account = new BankAccount();
//
//        try {
//            account.withdraw(700);
//        } catch (InsufficientBalanceException e) {
//            System.out.println("Fel: " + e.getMessage());
//        }


//        Person rasmus = new Person("Rasmus", 110);
//        System.out.println(rasmus.name);


//        try (FileInputStream stream = new FileInputStream("input.txt")) {
//            try {
//                int data = stream.read();
//                while (data != -1) {
//                    System.out.print((char) data);
//                    data = stream.read();
//                }
//            } catch (FileNotFoundException e) {
//                System.err.println("File not found: " + e.getMessage());
//            } catch (IOException e) {
//                System.err.println("Error reading file: " + e.getMessage());
//            }
//        } catch (IOException e) {
//            System.err.println("Error closing file: " + e.getMessage());
//        }

//        FileInputStream stream = null;
//        try {
//            stream = new FileInputStream("src/input.txt");
//            int data = stream.read();
//            while (data != -1) {
//                System.out.print((char) data);
//                data = stream.read();
//            }
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found: " + e.getMessage());
//        } catch (IOException e) {
//            System.err.println("Error reading file: " + e.getMessage());
//        } finally {
//            try {
//                if (stream != null) {
//                    stream.close();
//                }
//            } catch (IOException e) {
//                System.err.println("Error closing file: " + e.getMessage());
//            }
//        }
    }
}
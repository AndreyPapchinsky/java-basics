package Task_ten;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> file2ArrayList(String fileName) {
        ArrayList<String> arrayList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while (reader.ready()) {
                arrayList.add(reader.readLine());
            }
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }
        return (arrayList);
    }

    public static void string2File(String input, String fileName){
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter( new FileWriter(fileName));
            writer.write(input);
        } catch ( IOException e) {
            System.err.println("Error " + e.getMessage());
        }
        finally {
            try {
                if ( writer != null)
                    writer.close( );
            } catch ( IOException e){
                System.err.println("Error " + e.getMessage());
            }
        }
    }

    public static void merge2File(String files, String newFile){
        ArrayList<String> arrayList = new ArrayList<>();

        try {
            File folder = new File(files);
            File[] listOfFiles = folder.listFiles();

            for (int i = 0; i < listOfFiles.length; i++) {
                File file = listOfFiles[i];
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    BufferedReader reader = new BufferedReader (new FileReader (file));
                    String string = null;
                    while ((string = reader.readLine()) != null) {
                        arrayList.add(string);
                    }
                    reader.close();
                }
            }
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(newFile));
            String listWord;
            for (int i = 0; i< arrayList.size(); i++)
            {
                listWord = arrayList.get(i);
                writer.write(listWord);
                writer.write("\n");
            }
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }
        finally {
            try {
                if ( writer != null)
                    writer.close( );
            } catch ( IOException e){
                System.err.println("Error " + e.getMessage());
            }
        }
    }

    public static void replace(String fileName, String newFile){
        StringBuilder builder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String input;
            while ((input = reader.readLine()) != null){
                builder.append(input.replaceAll("[^A-Za-zА-Яа-я\\d]","\\$"));
            }
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(newFile));
            writer.write(builder.toString());
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }finally {
            try {
                if (writer != null){
                    writer.close();
                }
            }catch (IOException e){
                System.err.println("Error " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        merge2File("files","files/three.txt");
        replace("files/three.txt","files/four.txt");
    }
}

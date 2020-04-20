package com.IO;

import com.sun.javafx.collections.MappingChange;

import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Emotion> emotions = new ArrayList<>();
        Map<String, Images> data = new HashMap<>();
        Map<String, Map<String, Integer>> processData = new HashMap<>();
        List<String> process = new ArrayList<>();

        emotions.add(new Emotion("sadness"));
        emotions.add(new Emotion("happiness"));
        emotions.add(new Emotion("aggreeableness"));
        emotions.add(new Emotion("greed"));
        emotions.add(new Emotion("nero"));

        Images imageOne = new Images("1.jpg");
        imageOne.addEmotionList(emotions);

        Images imageTwo = new Images("2.jpg");
        imageTwo.addEmotion(emotions.get(0));
        imageTwo.addEmotion(emotions.get(2));
        imageTwo.addEmotion(emotions.get(3));

        Images imageThree = new Images("3.jpg");
        imageThree.addEmotion(emotions.get(1));
        imageThree.addEmotion(emotions.get(4));

        data.put(imageOne.getName(), imageOne);
        data.put(imageTwo.getName(), imageTwo);
        data.put(imageThree.getName(), imageThree);




        try(BufferedWriter locFile = new BufferedWriter(new FileWriter("emotions.txt")))
        {
            for(Images images : data.values()) {
                locFile.write(images.getName() + ",");
                for(Emotion emotion: images.getEmotions()) {
                    locFile.write( emotion.getName() + ",");
                }
                locFile.write("\n");
            }
        }catch (IOException e) {
             e.printStackTrace();
        }

        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("emotions.txt")))) {
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                String jpgName = scanner.nextLine();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                process.add(description);
                System.out.println("Imported loc: " + jpgName + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}

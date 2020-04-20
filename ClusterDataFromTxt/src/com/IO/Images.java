package com.IO;

import java.util.ArrayList;
import java.util.List;

public class Images {
    private String name;
    private List<Emotion> emotions;

    public Images(String name){
        this.name = name;
        this.emotions = new ArrayList<>();
    }

    public String getName(){
        return  this.name;
    }

    public void addEmotion(Emotion emotion){
        if(emotions.contains(emotion)){
            System.out.println("Emotion already exists");
        }else{
            emotions.add(emotion);
        }
    }

    public void addEmotionList(List<Emotion> emotion){
        this.emotions = emotion;
    }

    public List<Emotion> getEmotions() {
        return emotions;
    }
}

package com.example.translator2;

public class WordModel {
    private String englishWord,somaliWord;
    private int image;

    public int getMusic() {
        return music;
    }

    public void setMusic(int music) {
        this.music = music;
    }

    private int music;
    public WordModel() {
    }
    public WordModel(String englishWord, String somaliWord, int image,int music) {
        this.englishWord = englishWord;
        this.somaliWord = somaliWord;
        this.music = music;
        this.image = image;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getSomaliWord() {
        return somaliWord;
    }

    public void setSomaliWord(String kiswahiliWord) {
        this.somaliWord = kiswahiliWord;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }




}

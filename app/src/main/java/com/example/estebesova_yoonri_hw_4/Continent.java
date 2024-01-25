package com.example.estebesova_yoonri_hw_4;

public class Continent {
    private String name;
    private int image;
    private int keyId;

    public Continent(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public Continent(String name, int image, int keyId) {
        this.name = name;
        this.image = image;
        this.keyId = keyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getKeyId() {
        return keyId;
    }

    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }
}
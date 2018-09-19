package com.example.sahil.internshipprogram;

public class Pogo {
    int image;
    String ad;
    String training;
    String about;
    String offer;
    String web;
    String full;
    String paid;

    public Pogo(int image, String ad, String training, String about, String offer, String web, String full, String paid) {
        this.image = image;
        this.ad = ad;
        this.training = training;
        this.about = about;
        this.offer = offer;
        this.web = web;
        this.full = full;
        this.paid = paid;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }
}

package com.luxoft.springel.example02;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("languageBean")
public class Language {

    @Value("0")
    private int id;

    @Value("ru_RU")
    private String code;

    @Value("Russian")
    private String Name;

    public Language() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Language{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}

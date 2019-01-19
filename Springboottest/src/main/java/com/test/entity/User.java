package com.test.entity;

public class User {
    private String name;
    private String term_id;
    private String sex;


    public User() {
    }

    public User(String name, String term_id, String sex) {
        this.name = name;
        this.term_id = term_id;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerm_id() {
        return term_id;
    }

    public void setTerm_id(String term_id) {
        this.term_id = term_id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

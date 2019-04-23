package com.baizhi.entity;

public class Emp {
    private String id;
    private String name;
    private Integer age;

    public Emp(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Emp() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

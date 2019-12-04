package org.java.entity;

import java.util.Date;
import javax.persistence.*;

@Table
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String gender;

    private String clazz;

    private Integer score;

    private Date bir;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return clazz
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * @param clazz
     */
    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    /**
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * @return bir
     */
    public Date getBir() {
        return bir;
    }

    /**
     * @param bir
     */
    public void setBir(Date bir) {
        this.bir = bir;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", clazz='" + clazz + '\'' +
                ", score=" + score +
                ", bir=" + bir +
                '}';
    }
}
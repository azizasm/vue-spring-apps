package com.hokenso.vuespringapps.domain;

import javax.persistence.*;

@Entity
@Table(name = "challenges")
public class Challenges {

    // PrimaryKey
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String level;
    private String link;
    private String cal;
    private String author;
    private String points;
    private String image;


    protected Challenges() {
    }

    public Challenges(String title, String level, String link,
                      String cal, String author, String points,
                      String image) {
        this.title = title;
        this.level = level;
        this.link = link;
        this.cal = cal;
        this.author = author;
        this.points = points;
        this.image = image;
    }

    @Override
    public String toString() {
        return String.format(
                "Challenges[id=%d, title='%s', level='%s', link='%s', cal='%s', author='%s', points='%s', image='%s']",
                id, title, level, link, cal, author, points, image);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCal() {
        return cal;
    }

    public void setCal(String cal) {
        this.cal = cal;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

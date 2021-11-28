package com.lagou.domain;

/**
 * @author Huw_Lin
 * time: 2021-11-17 21:33
 */
public class t_comment {
    private int id;
    private String content;
    private String author;
    private int a_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public t_comment() {
    }

    @Override
    public String toString() {
        return "t_comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", a_id=" + a_id +
                '}';
    }
}

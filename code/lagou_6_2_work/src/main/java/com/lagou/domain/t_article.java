package com.lagou.domain;

import java.util.List;

/**
 * @author Huw_Lin
 * time: 2021-11-17 21:30
 */
public class t_article {
    private int id;
    private String title;
    private String  content;
    private List<t_comment> commentsList;

    public List<t_comment> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<t_comment> commentsList) {
        this.commentsList = commentsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public t_article() {
    }

    @Override
    public String toString() {
        return "t_article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", commentsList=" + commentsList +
                '}';
    }
}

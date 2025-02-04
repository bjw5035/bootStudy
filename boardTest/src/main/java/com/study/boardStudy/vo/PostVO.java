package com.study.boardStudy.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostVO {

    private int id;
    private String title;
    private String content;
    private String author;
    private String createDate;
    private String updateDate;

    public PostVO() {}

    public PostVO(int id, String title, String content, String author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public PostVO(int id, String title, String content, String author, String createDate, String updateDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "PostVO{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", author='" + author + '\'' +
            ", createDate='" + createDate + '\'' +
            ", updateDate='" + updateDate + '\'' +
            '}';
    }
}

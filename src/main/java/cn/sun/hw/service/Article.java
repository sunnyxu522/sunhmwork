package cn.sun.hw.service;

public class Article {

    private String title;
    private String content;
    private int claps;

    public Article(String title, String content, int claps) {
        this.title = title;
        this.content = content;
        this.claps = claps;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getClaps() {
        return claps;
    }

}

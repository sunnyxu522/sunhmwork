package cn.sun.hw.service;
import java.util.*;


public class TopArticlesStorage{

    public static void main(String[] args) {
        TopArticlesStorage storage = new TopArticlesStorage();
//        storage.addArticle("Article 1", "Content 1", 100);
//        storage.addArticle("Article 2", "Content 2", 200);
//        storage.addArticle("Article 3", "Content 3", 150);
//        storage.addArticle("Article 4", "Content 4", 300);
//        storage.addArticle("Article 5", "Content 5", 250);
//        storage.addArticle("Article 1", "Content 1", 100);
//        storage.addArticle("Article 2", "Content 2", 200);
//        storage.addArticle("Article 3", "Content 3", 150);
//        storage.addArticle("Article 4", "Content 4", 300);
//        storage.addArticle("Article 5", "Content 5", 250);
//        storage.addArticle("Article 1", "Content 1", 100);
//        storage.addArticle("Article 97", "Content 97", 90013);
//        storage.addArticle("Article 96", "Content 96", 90012);
//        storage.addArticle("Article 95", "Content 95", 90011);
//        storage.addArticle("Article 94", "Content 94", 90010);
//        storage.addArticle("Article 93", "Content 93", 90009);
//        storage.addArticle("Article 92", "Content 92", 90006);
//        storage.addArticle("Article 91", "Content 91", 90003);
//        storage.addArticle("Article 90", "Content 90", 90000);

        storage.printTopArticles();
    }

    private PriorityQueue<Article> topArticles;

    public TopArticlesStorage() {
    	//初始化优先序列10个长度
        topArticles = new PriorityQueue<>(10, Comparator.comparingInt(Article::getClaps));
    }

    public void addArticle(String title, String content, int claps) {
        Article newArticle = new Article(title, content, claps);
        if (topArticles.size() < 10) {
            topArticles.offer(newArticle);
        } else if (claps > topArticles.peek().getClaps()) {
            topArticles.poll();
            topArticles.offer(newArticle);
        }
    }

    public List<Article> printTopArticles() {
        List<Article> topList = new ArrayList<>(topArticles);
        topList.sort(Comparator.comparingInt(Article::getClaps).reversed());
        for (Article article : topList) {
            System.out.println("Title: " + article.getTitle());
            System.out.println("Claps: " + article.getClaps());
            System.out.println("Content: " + article.getContent());
            System.out.println();
        }
        return topList;
    }

}

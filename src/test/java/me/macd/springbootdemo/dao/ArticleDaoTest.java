package me.macd.springbootdemo.dao;

import me.macd.springbootdemo.pojo.Article;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleDaoTest {

    @Autowired
    private ArticleDao articleDao;

    @Test
    public void queryArticle() {
        List<Article> articleList = articleDao.queryArticle();
        assertEquals(1, articleList.size());
    }

    @Test
    public void queryArticleById() {
        Article article = articleDao.queryArticleById(20);
        assertEquals("abc", article.getContent());
    }

    @Test
    @Ignore
    public void insertArticle() {
        Article article = new Article();
        article.setContent("abc");
        article.setCreateTime(new Date());
        article.setUpdateTime(new Date());
        article.setDeleteStatus("1");
        int effectedNum = articleDao.insertArticle(article);
        assertEquals(1, effectedNum);
    }

    @Test
    @Ignore
    public void updateArticle() {
    }

    @Test
    @Ignore
    public void deleteArticle() {
    }
}
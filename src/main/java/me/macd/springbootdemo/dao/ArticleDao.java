package me.macd.springbootdemo.dao;

import me.macd.springbootdemo.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface ArticleDao {
    List<Article> queryArticle();

    Article queryArticleById(Integer id);

    int insertArticle(Article article);

    int updateArticle(Article article);

    int deleteArticle(Integer id);
}

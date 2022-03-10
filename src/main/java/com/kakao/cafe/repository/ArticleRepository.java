package com.kakao.cafe.repository;

import com.kakao.cafe.domain.Article;

import java.util.List;

public interface ArticleRepository {

    void save(Article article);

    List<Article> getArticleList();

    Article findById(int articleId);

    void clearStorage();

}

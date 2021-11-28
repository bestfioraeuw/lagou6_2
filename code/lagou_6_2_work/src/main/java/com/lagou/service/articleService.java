package com.lagou.service;

import com.lagou.domain.t_article;

import java.util.List;

/**
 * @author Huw_Lin
 * time: 2021-11-28 18:47
 */
public interface articleService {

    public List<t_article> findAllArticle();

    public int saveArticle(t_article article);
}

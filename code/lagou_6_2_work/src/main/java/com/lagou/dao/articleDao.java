package com.lagou.dao;

import com.lagou.domain.t_article;

import java.util.List;

/**
 * @author Huw_Lin
 * time: 2021-11-28 17:43
 */
public interface articleDao {
    //查询文章信息
    public List<t_article> findAllArticle();

    //添加文章信息
    public int saveArticle(t_article article);
}

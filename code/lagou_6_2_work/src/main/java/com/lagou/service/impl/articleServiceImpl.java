package com.lagou.service.impl;

import com.lagou.dao.articleDao;
import com.lagou.domain.t_article;
import com.lagou.service.articleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.List;

/**
 * @author Huw_Lin
 * time: 2021-11-28 18:48
 */

//注入IOC
@Service
public class articleServiceImpl implements articleService {

    @Autowired
    private articleDao articleDao;



    @Override
    public List<t_article> findAllArticle() {
        return  articleDao.findAllArticle();
    }

    @Override
    public int saveArticle(t_article article) {
        return articleDao.saveArticle(article);
    }
}

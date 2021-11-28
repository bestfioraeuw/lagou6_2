package com.lagou.dao.impl;

import com.lagou.dao.articleDao;
import com.lagou.domain.t_article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Huw_Lin
 * time: 2021-11-28 17:46
 */
//注入依赖
    @Repository
public class articleDaoImpl implements articleDao {

        //注入JDBCTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<t_article> findAllArticle() {
        String sql = "select * from t_article";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(t_article.class));
    }


    //使用jdbctemplate
    @Override
    public int saveArticle(t_article article) {
        String sql = "insert into t_article values(null,?,?)";
        return jdbcTemplate.update(sql,article.getTitle(),article.getContent());

    }
}

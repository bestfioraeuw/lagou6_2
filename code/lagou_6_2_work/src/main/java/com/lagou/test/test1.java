package com.lagou.test;

import com.lagou.domain.t_article;
import com.lagou.service.articleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Huw_Lin
 * time: 2021-11-28 23:11
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test1 {

    @Autowired
    private articleService articleService;


    @Test
    public void test1(){
        //创建t_article对象
        t_article article = new t_article();
        article.setTitle("测试用例");
        article.setContent("这是一个测试用例");

        int i = articleService.saveArticle(article);
        System.out.println(i);
    }
}

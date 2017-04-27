package cn.g2link.controller;

import cn.g2link.entity.News;
import cn.g2link.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by G2_User on 2017/4/26.
 */
@RestController
@RequestMapping("/test/")
public class TestController {
    @Autowired
    private NewsService newsService;
    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }
    @RequestMapping("hello2")
    public List<News> hello2(){
        List<News> news =newsService.findAllNews();
        return news;
    }
}

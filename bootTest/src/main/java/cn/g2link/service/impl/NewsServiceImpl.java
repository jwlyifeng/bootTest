package cn.g2link.service.impl;

import cn.g2link.dao.mappers.NewsMapper;
import cn.g2link.entity.News;
import cn.g2link.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsMapper newsMapper;
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm");


	@Override
	public List<News> findAllNews() {
		return newsMapper.findAllNews();
	}
}

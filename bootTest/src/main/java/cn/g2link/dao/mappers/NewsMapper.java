package cn.g2link.dao.mappers;

import cn.g2link.entity.News;

import java.util.List;


public interface NewsMapper extends BaseMapper<News>{
	 List<News> findAllNews();
}

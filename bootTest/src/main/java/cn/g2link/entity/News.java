package cn.g2link.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter @Getter
public class News {
	private String newsId;
	private String newsTitle;
	private Date publishTime;
	private Integer viewNum;
	private Short newsType;
	private String newsBody;
	private String source;
	private String refsId;
	private Date createTime;
}

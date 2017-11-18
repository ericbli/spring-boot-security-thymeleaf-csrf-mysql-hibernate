package com.eric.dao;
import java.util.List;

import com.eric.entity.Article;
import com.eric.entity.UserInfo;
public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
	List<Article> getAllUserArticles();
}
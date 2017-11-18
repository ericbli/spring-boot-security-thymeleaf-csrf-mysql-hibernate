package com.eric.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eric.dao.IUserInfoDAO;
import com.eric.entity.Article;
@Service
public class UserInfoService implements IUserInfoService {
	@Autowired
	private IUserInfoDAO userInfoDAO;
	@Override
	public List<Article> getAllUserArticles(){
		return userInfoDAO.getAllUserArticles();
	}
}

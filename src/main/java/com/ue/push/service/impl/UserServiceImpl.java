package com.ue.push.service.impl;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.util.Base64Decoder;
import com.thoughtworks.xstream.core.util.Base64Encoder;
import com.ue.push.pojo.User;
import com.ue.push.service.UserService;
@Service(value="userServiceImpl")
public class UserServiceImpl implements UserService{

	public User getUserByUsernamePassword(String username, String password)
			throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		return null;
	}

	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getRolenameListByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

		
}

package com.ld.service;

import com.ld.domain.User;
import com.ld.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private JedisCluster jedisCluster;

	@Autowired
	private UserMapper userMapper;


	public void add(User u) {
		userMapper.add(u);
	}

	public void update(User u) {
		userMapper.update(u);
	}

	public User get(long id) {
		return userMapper.get(id);
	}

	public User login(String name) {
		return userMapper.login(name);
	}

	public void delete(long id) {
		userMapper.delete(id);
	}

	public List<User> list() {
		return userMapper.list();
	}

	public void redisSet(String name,String pass) {
		jedisCluster.set(name,pass);
	}

	public String redisGet(String name) {
		return jedisCluster.get(name);
	}
}

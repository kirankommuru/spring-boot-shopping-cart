package com.test.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.test.user.domain.User;

/**
 * 
 * @author kiran
 *
 */
public interface UserRepository extends MongoRepository<User, String> {
	public User findByUserName(String userName);
}

/**
 * 
 */
package org.andylabs.demo.mappers;


import org.andylabs.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Siva
 *
 */
@Repository
public interface UserMapper
{

	void insertUser(User user);

	User findUserById(Integer id);

	List<User> findAllUsers();
	
}

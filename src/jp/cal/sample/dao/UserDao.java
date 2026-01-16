package jp.cal.sample.dao;

import java.util.ArrayList;
import java.util.List;
import jp.cal.sample.entity.User;

public interface UserDao {

	List<User> findAll();
	
}

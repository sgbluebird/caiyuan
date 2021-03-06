package cn.hellyuestc.caiyuan.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.hellyuestc.caiyuan.util.MyUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-applicationContext.xml", "classpath:mybatis-configuration.xml"})
public class UserDaoTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void test() {
		userDao.updateAvatarUrl(1, "http://os3s19y8b.bkt.clouddn.com/user_avatar_default.png");
	}

}

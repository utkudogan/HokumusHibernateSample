package com.hokumus.hib.proje.main;
import java.sql.Date;
import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hokumus.hib.proje.dao.UsersDBDao;
import com.hokumus.hib.proje.models.Role;
import com.hokumus.hib.proje.models.UserDetails;
import com.hokumus.hib.proje.models.Users;
import com.hokumus.hib.proje.ui.LoginFrame;
import com.hokumus.hib.proje.util.DbServicessBase;
import com.hokumus.hib.proje.util.MyHBUtil;

public class Runner {
	
	public static void main(String[] args) {
//		LoginFrame l = new LoginFrame();
//		l.setVisible(true);
//		
//		UsersDBDao dao = new UsersDBDao();
//		Users temp = new Users();
//		temp.setUserName("s");
//		dao.search(temp);
		
		
//		Session ss = MyHBUtil.getSessionFactory().openSession();
//		Transaction tt = ss.beginTransaction();
//		Users temp = new Users();
//		//temp.setId(3);
//		temp.setUserName("hokumus");
//		temp.setPassword("123");
//		temp.setEmail("dfdsfdkfþlk");
//		temp.setUserRole(Role.USER);
//		try {
//			ss.save(temp);
//			tt.commit();
//		} catch (Exception e) {
//			tt.rollback();
//		}
		
		Users u = new Users();
		u.setId(1);
		UserDetails temp = new UserDetails();
		temp.setName("hüseyin");
		temp.setBirthOfDay(new Date(1986, 1, 25));
		temp.setPlaceOfBirth("Ankara");
		temp.setSurname("Okumuþ");
		temp.setTcKNo("321321213132");
		temp.setYas(33);
		temp.setUsers(u);
		
		DbServicessBase<UserDetails> dao = new DbServicessBase<UserDetails>();
		dao.save(temp);
		
		
		
	}

}

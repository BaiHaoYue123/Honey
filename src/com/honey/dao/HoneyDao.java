package com.honey.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.honey.model.Customer;
import com.honey.model.Honey;

@Service @Transactional
public class HoneyDao {
	@Resource SessionFactory factory;
	
	public void addHoney(Honey honey) throws Exception{
		Session s= factory.getCurrentSession();
		s.save(honey);
		
	}
	
	public void deleteHoney(Integer honeyId) throws Exception{
		Session s= factory.getCurrentSession();
		Object hoeny= s.load(Honey.class, honeyId);
		s.delete(hoeny);
		
	}
	
    public void updateHoney(Honey honey) throws Exception {
        Session s = factory.getCurrentSession();
        s.update(honey);
    }
    
    public ArrayList<Honey> queryAllHoney() {
        Session s = factory.getCurrentSession();
        String hql = "From Honey";
        Query q = s.createQuery(hql);
        List honeyList = q.list();
        return (ArrayList<Honey>) honeyList;
    }
    
    public Honey getHoneyById(Integer honeyid) {
        Session s = factory.getCurrentSession();
        Honey honey = (Honey)s.get(Honey.class, honeyid);
        return honey;
    }
    
    public ArrayList<Honey> queryHoneyInfo(String honeyname) { 
    	Session s = factory.getCurrentSession();
    	String hql = "From Honey honey where 1=1";
    	if(!honeyname.equals("")) hql = hql + " and honey.honeyname like '%" + honeyname + "%'";
    	Query q = s.createQuery(hql);
    	List honeyList = q.list();
    	return (ArrayList<Honey>) honeyList;
    }

}

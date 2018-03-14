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
import com.honey.model.Order;


@Service @Transactional
public class OrderDao {
	@Resource SessionFactory factory;
	
	 /*���Order��Ϣ*/
    public void AddOrder(Order order) throws Exception {
    	Session s = factory.getCurrentSession();
    	s.save(order);
    }
    
    /*ɾ��Order��Ϣ*/
    public void DeleteOrder (Integer orderId) throws Exception {
        Session s = factory.getCurrentSession(); 
        Object order = s.load(Order.class, orderId);
        s.delete(order);
    }
    
    /*����Order��Ϣ*/
    public void UpdateOrder(Order order) throws Exception {
        Session s = factory.getCurrentSession();
        s.update(order);
    }
    
    /*��ѯ����Order��Ϣ*/
    public ArrayList<Order> QueryAllOrder() {
        Session s = factory.getCurrentSession();
        String hql = "From Order";
        Query q = s.createQuery(hql);
        List orderList = q.list();
        return (ArrayList<Order>) orderList;
    }

    /*����������ȡ����*/
    public Order GetOrderById(Integer orderid) {
        Session s = factory.getCurrentSession();
        Order order = (Order)s.get(Order.class, orderid);
        return order;
    }
    
    /*���ݲ�ѯ������ѯ��һ����˵��������ѯʱ��������û�ID���Ӧ�Ķ������������ʳ�����Ʋ��Ӧ�Ķ���*/
    public ArrayList<Order> QueryOrderInfo(Customer customer, Honey honey) {
    	Session s = factory.getCurrentSession();
    	String hql = "From Order order where 1=1";
    	if(null != customer && customer.getCustomerid()!=0) 
    		hql = hql + " and order.customer.customerid like '%" + customer.getCustomerid() + "%'";
    	if(null != honey && null!=honey.getHoneyname()) 
    		hql = hql + " and order.honey.honeyname like '%" +honey.getHoneyname() + "%'";
    	Query q = s.createQuery(hql);
    	List orderList = q.list();
    	return (ArrayList<Order>) orderList;
    }

}

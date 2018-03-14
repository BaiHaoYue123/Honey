package com.honey.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.honey.dao.HoneyDao;
import com.honey.model.*;
import com.opensymphony.xwork2.ActionSupport;

@Controller @Scope("prototype")
public class HoneyAction extends ActionSupport{
	
	 /*涓氬姟灞傚璞�*/
    @Resource HoneyDao honeyDao;
    
    
    private Honey honey;

	public Honey getHoney() {
		return honey;
	}

	public void setHoney(Honey honey) {
		this.honey = honey;
	}
	
	private List<Honey> honeyList;
	
	public List<Honey> getHoneyList() {
		return honeyList;
	}

	public void setHoneyList(List<Honey> honeyList) {
		this.honeyList = honeyList;
	}
	
	private String keyWords;
	
	public String getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	
	/*娣诲姞Honey*/
	public String addHoney() throws Exception{
		
		System.out.println(honey.getHoneyname());
		honeyDao.addHoney(honey);
		return "message";
		
	}
	
	/*鏄剧ず鎵�鏈塇oney*/
    public String showHoney() {
        
        honeyList = honeyDao.queryAllHoney();
        return "show_view";
    }

    /*鏄剧ず鏌愪竴Honey鐨勮缁嗕俊鎭�*/
    public String showDetail() {
    	honey = honeyDao.getHoneyById(honey.getHoneyid());
        return "detail_view";
    }
    
    /*鏄剧ずhoney鐨勪慨鏀归」*/
    public String showEdit() throws Exception {
    	honey = honeyDao.getHoneyById(honey.getHoneyid());
        return "edit_view";
    }

    /*缂栬緫honey*/
    public String editHoney() throws Exception {
    	honeyDao.updateHoney(honey);
        return "edit_message";
    }
    
    /*鍒犻櫎Honey*/
    public String deleteHoney() throws Exception {
    	honeyDao.deleteHoney(honey.getHoneyid());
        return "delete_message";
    }
    
    /*鏌ヨHoney*/
    public String queryHoneys() throws Exception {
    	honeyList = honeyDao.queryHoneyInfo(keyWords);
        return "show_view";
    }




}

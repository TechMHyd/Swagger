package com.swiggy.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.swiggy.domain.MenuItem;

@Service
public class SwiggyMenuService {
	
	Map<Integer,MenuItem> menu = new HashMap<Integer,MenuItem>();
	
	static List<MenuItem> cacheMenu = new ArrayList<MenuItem>();
	boolean isCacheEnabled = true;
	
	public SwiggyMenuService(){
		init();
	}
	
	public MenuItem[] getItems(){
		return menu.values().toArray(new MenuItem[0]);
	}
	
	public MenuItem getItem(int id){
		return menu.get(id);
	}
	
	private void init(){
		MenuItem item1 = new MenuItem(1, "Dosa", "Indian Dosa", true, 40);
		MenuItem item2 = new MenuItem(2, "Idly", "Plain Idly", true, 30);
		MenuItem item3 = new MenuItem(3, "Vada", "Mettu Vada", true, 50);
		MenuItem item4 = new MenuItem(4, "TRice", "Tamarind Rice", true, 150);
		MenuItem item5 = new MenuItem(5, "Chicken Biryani", "Hyd Dum biryani", false, 150);
		MenuItem item6 = new MenuItem(6, "Soup", "chicken Soup",false, 80);
		MenuItem item7 = new MenuItem(7, "Bonda", "Mysore Bajji", true, 30);
		MenuItem item8 = new MenuItem(8, "meals", "Veg Meals ", true, 60);
		
		menu.put(item1.getId(),item1);
		menu.put(item2.getId(),item2);
		menu.put(item3.getId(),item3);
		menu.put(item4.getId(),item4);
		menu.put(item4.getId(),item5);
		menu.put(item6.getId(),item6);
		menu.put(item7.getId(),item7);
		menu.put(item8.getId(),item8);
		

		//Added this bug for performance testing
		if(isCacheEnabled){
			cacheMenu.add(item1);
			cacheMenu.add(item2);
			cacheMenu.add(item3);
			cacheMenu.add(item4);
			cacheMenu.add(item5);
			cacheMenu.add(item6);
			cacheMenu.add(item7);
			cacheMenu.add(item8);
			System.out.println("No of objects cached = " + cacheMenu.size());
		}
	}
}

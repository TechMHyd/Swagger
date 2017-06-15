package com.swiggy.service;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.swiggy.domain.MenuItem;
@Repository
public interface MenuItemRepository  {
	

	public List<MenuItem> findAll();
}



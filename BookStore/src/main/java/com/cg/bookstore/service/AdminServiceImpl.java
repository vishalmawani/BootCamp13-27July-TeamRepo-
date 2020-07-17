package com.cg.bookstore.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookstore.dao.AdminDao;
import com.cg.bookstore.dto.AdminDto;
import com.cg.bookstore.entities.Admin;
import com.cg.bookstore.exceptions.AdminException;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;

	@Override
	public boolean addAdmin(AdminDto adminDto) {

		return adminDao.addAdmin(adminDto);
	}

	@Override
	public String editAdmin(long adminId, Admin admin) throws AdminException{
		if(adminDao.editAdmin(adminId, admin))
			return "Admin updated";
		else
			throw new AdminException("Admin not found.");
	}

}

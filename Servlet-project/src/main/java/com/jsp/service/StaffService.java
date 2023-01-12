package com.jsp.service;

import java.util.List;

import com.jsp.dao.StaffDao;
import com.jsp.dto.Staff;

public class StaffService {

	public Staff saveStaff(Staff staff) {
		StaffDao staffDao = new StaffDao();
		return staffDao.saveStaff(staff);
	}
	public Staff getStaffById(int id) {
		StaffDao staffDao = new StaffDao();
		return staffDao.getStaff(id);
	}
	public List<Staff> getAllStaff() {
		StaffDao staffDao = new StaffDao();
		return staffDao.getAllStaffs();
	}
	public Staff deleteStaff(int id) {
		StaffDao staffDao = new StaffDao();
		return staffDao.deleteStaff(id);
	}
	public Staff updateStaff(int id,String name) {
		StaffDao staffDao = new StaffDao();
		return staffDao.updateStaffName(id, name);
	}
	
}

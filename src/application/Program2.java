package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.CreateDepartmentDao(); // Estabelecer a conexão
		
		System.out.println("\n=== SELECT DEPARTMENT BY ID === ");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		
		
//		DB.closeConnection();
	}
	
	
}

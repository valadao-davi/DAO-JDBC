package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.CreateDepartmentDao(); // Estabelecer a conexão
		
		System.out.println("\n=== SELECT DEPARTMENT BY ID === ");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n=== SELECT ALL DEPARTMENTS === ");
		List<Department> listDep = departmentDao.findAll();
		for(Department i : listDep) {
			System.out.println(i);
		}
		
//		DB.closeConnection();
	}
	
	
}

package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.CreateSellerDao(); // Essa interface vai receber os métodos do JDBC
		System.out.println("\n=== FIND SELLER BY ID AND RETURN IN BASE OF DEPARTMENT ID ===");
		
		Seller seller  = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n === FIND SELLER BY DEPARTMENT ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller sel : list) { 
			System.out.println(sel);
		}
		
		System.out.println("\n=== FIND SELLER ALL ===");
		list = sellerDao.findAll();
		for(Seller sel : list) { 
			System.out.println(sel);
		}
		
		System.out.println("\n=== INSERT SELLER ===");
		Seller seller2 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(seller2);
		System.out.println("Id of new inserted: " + seller2.getId());
		
		System.out.println("\n=== UPDATE SELLER ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		
		System.out.println("\n=== DELETE SELLER ===");
		System.out.println("Enter id for delete Seller");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		
		sc.close();
	}

}

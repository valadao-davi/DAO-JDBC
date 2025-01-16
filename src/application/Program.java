package application;


import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.CreateSellerDao(); // Essa interface vai receber os métodos do JDBC
		System.out.println("=== FIND USER BY ID AND RETURN IN BASE OF DEPARTMENT ID ===");
		int id = sc.nextInt();
		
		Seller seller  = sellerDao.findById(id);
		sc.close();
		
		System.out.println(seller);
		
	}

}

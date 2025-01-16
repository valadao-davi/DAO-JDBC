package application;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		
		SellerDao sellerDao = DaoFactory.CreateSellerDao(); // Essa interface vai receber os métodos do JDBC
		
		Seller seller  = sellerDao.findById(3);
		
		System.out.println(seller);
		
	}

}

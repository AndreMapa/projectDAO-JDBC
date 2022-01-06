package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerdao = DaoFactory.creatSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerdao.findById(3);
		
		System.out.println(seller);
	}

}

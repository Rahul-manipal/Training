import com.ey.shop.CartException;
import com.ey.shop.Product;
import com.ey.shop.ShoppingCart;

public class TestShopping {
   public static void main(String[] args) {
	   
	ShoppingCart cart = new ShoppingCart();
	
//	Product p1 = new Product("iphone X", 23000);
//	try {
//		cart.addToCart(p1);
//	} catch (CartException e) {
//		e.printStackTrace();
//	}
//	
//	try {
//		cart.addToCart(new Product("AirPods2", 8999));
//	} catch (CartException e) {
//		e.printStackTrace();
//	}
//	try {
//		cart.addToCart(new Product("Apple watch SE", 33000));
//	} catch (CartException e) {
//		e.printStackTrace();
//	}
//	
//	cart.checkout();
	cart.addToCart(new Product("AirPods2", 8999));
	cart.addToCart(new Product("Apple watch SE", 33000));
	cart.checkout();
	

	
}
}

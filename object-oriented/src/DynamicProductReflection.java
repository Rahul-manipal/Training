import java.lang.reflect.Constructor;

public class DynamicProductReflection {
	public static void main(String[] args) throws Exception {

		Class pc = Class.forName("com.ey.shop.Product");

		Constructor ctr = pc.getConstructor(String.class, double.class);

		Object obj = ctr.newInstance("Nokia 3310", 1600);//using newinstance method of reflection api we are creating object just like new keyword

		System.out.println(obj);
	}
}

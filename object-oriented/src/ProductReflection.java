import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.ey.shop.Product;

public class ProductReflection {
         public static void main(String[] args) throws Exception {
//			Product p1 = new Product("Parker", 120);
//			p1.print();
//			System.out.println(p1);
        	 
        	 Class pc = Class.forName("com.ey.shop.Product");//  it loads a java class manually in memory
			
			
			System.out.println(pc.getName());
			System.out.println(pc.getPackageName());
			System.out.println(pc.getSimpleName());
			
			System.out.println("-- list of constructors");
			Constructor[] constructors = pc.getConstructors();
			for(Constructor c : constructors)
				System.out.println(c);
			
			System.out.println();
			
			System.out.println("-- list of methods");
			Method[] methods = pc.getMethods();
			for( Method m : methods)
				System.out.println(m);
			System.out.println();
			
			System.out.println("-- list of declared methods");
			Method[] decMethods = pc.getDeclaredMethods()
;
			for(Method m : decMethods)
			System.out.println(m);
			
			System.out.println();
			System.out.println("-- list of fields");
			Field[] fields = pc.getDeclaredFields();
			for(Field f : fields)
				System.out.println(f);
			
		}
}

//creating generic class - supports everything but problem with object is that is it also generic so anytime we change object to anytype
public class Demo {
private Object data;

public Demo(Object data) {
	this.data = data;
}

public Object getData()
{
	return data;
}

public void setData(Object data)
{
	this.data= data;
}

public static void main(String[] args) {
	Demo d1= new Demo("Hola");
	//d1.setData(3.14);//creating problem bcz of generic object
	System.out.println(d1.getData());
	
	Demo d2= new Demo(99);
	//d1.setData("Bonjour");//creating problem bcz of generic object
	System.out.println(d2.getData());
	
	Demo d3= new Demo(new Person("kim", 21));
	System.out.println(d3.getData());
}

}

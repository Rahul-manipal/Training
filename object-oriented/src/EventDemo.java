class OuterEventImpl implements Event
{

	@Override
	public void doSomething() {
		System.out.println("Outer event implementation");
	}
	
}
public class EventDemo implements Event {

	@Override
	public void doSomething() {
		System.out.println("Simple event implementation");
	}
	
private	class InnerEventImpl implements Event{

		@Override
		public void doSomething() {
			System.out.println("Inner event implementation");
		}
		
	}
	
public static class StaticEventImpl implements Event{

	@Override
	public void doSomething() {

		System.out.println("static event implementation");
	}
	
}

public void oneMoreEvent()
{
	class NestedEventImpl implements Event{

		@Override
		public void doSomething() {
			System.out.println("Nested event implementation");			
		}
		
	};
	
	new NestedEventImpl().doSomething();
}

public void oneLastEvent()
{
	Event e = new Event ()
	{

		@Override
		public void doSomething() {
			System.out.println("Anonymous event implementation");	// this class don't have name		
		}
		
	};
	e.doSomething();
	
}

public void pakkaLatEvent()
{
	Event e = () -> System.out.println("Lambda event implementation");//lambda implementation in java
	e.doSomething();
}
	public static void main(String[] args) {
		EventDemo ed = new EventDemo();
		ed.doSomething();
		
		OuterEventImpl oe = new OuterEventImpl();
		oe.doSomething();
		
		InnerEventImpl ei = ed.new InnerEventImpl();// here error was giving bcz we created class in class so we solve this problem by using ed.
		ei.doSomething();
		
		EventDemo.StaticEventImpl se = new EventDemo.StaticEventImpl();
		se.doSomething();
		
		ed.oneMoreEvent();
		ed.oneLastEvent();
		ed.pakkaLatEvent();
	}

	

}


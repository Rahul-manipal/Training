package com.ey.adapter;

public class AdapterDemo {
public static void main(String[] args) {
	
	Turbo t = new SportsCar("Ferari california", 220);
	System.out.println(t);
	
	System.out.println("Top Speed: " + t.getSpeed());
	Nitro n1 = new SpeedAdapter(t);
	System.out.println("Top Speed Kms: " + n1.getSpeedKms());
	
	Turbo t2 = new SportsCar("Porsche 911", 220);
	System.out.println(t2);
	
	System.out.println("Top Speed: " + t2.getSpeed());
	
	
	Nitro n2 = new SpeedAdapter(t2);
	System.out.println("Top Speed Kms: " + n2.getSpeedKms());
	
	
}
}

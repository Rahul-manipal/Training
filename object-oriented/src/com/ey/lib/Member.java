package com.ey.lib;

public class Member {
  private String name;
  private Book book;
public Member(String name) {
	super();
	this.name = name;
}

public void status()
{
	if(book == null)
	{
		System.out.println(name + " has not not issued to any book");
	}
	else
		System.out.println(name + "has issued " + book.getTitle());
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Book getBook() {
	return book;
}

public void setBook(Book book) {
	this.book = book;
}

  
}

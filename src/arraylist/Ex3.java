package arraylist;

import java.util.ArrayList;

public class Ex3 {
	public static void main(String[] args) {
		ArrayList<Book>list = new ArrayList<Book>();
		
		Book book1 = new Book("태백산맥", "조정래");
		
		list.add(book1);
		
		list.add(new Book("데미안", "헤르만 헤세"));
		
		System.err.println(list);
		for (int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			book.showBookInfo();
		}

		// 람다식 for문 사용
		for (Book book : list) {
			book.showBookInfo();
		}
	}

}

class Book{
	
	String bookName;
	String author;
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
	
}
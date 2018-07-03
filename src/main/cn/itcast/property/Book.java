package cn.itcast.property;

/**
 * Created by hjt on 2018/7/3.
 */
public class Book {

    private String bookname;

    public Book(String bookname) {
        this.bookname = bookname;
    }

    public void testBook() {
        System.out.println("book.............." + bookname);
    }

}

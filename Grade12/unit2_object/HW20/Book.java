package Grade12.unit2_object.HW20;

/*
 * Question 1
 * A a = new A();   Print A
 * B b = new B();   Print B
 * A c = new B();   Print B
 * 
 */

public class Book {
	private String title;
	private String author;
    private String timePeriod;

	public Book (String title, String author, String timePeriod) {
		this.title = title;
        this.author = author;
        this.timePeriod = timePeriod;
	}
	public String toString(){
		return "Title: " + title + "\nAuthor: " + author + "\nTime Period: " + timePeriod;
	}
}

class History extends Book {

    private String title;
	private String author;
    private String timePeriod;

    public History (String title, String author, String timePeriod) {	
		super(title, author, timePeriod);
        this.title = title;
        this.author = author;
        this.timePeriod = timePeriod;
	}
	public String toString(){
		return "Title: " + title + "\nAuthor: " + author + "\nTime period: " + timePeriod;
	}
}

/*Question 1
 * a) A
 * b) B
 * c) B
 */

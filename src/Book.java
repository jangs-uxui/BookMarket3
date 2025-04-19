public class Book { // DTO (책 객체 생성)

    // 멤버변수 (캡슐화 위해 private)
    private String bookId;
    private String title;
    private int price;
    private String author;
    private String description;
    private String category;
    private String publishDate;

    // 생성자(멤버변수 초기화)
    public Book(String bookId, String title, int price, String author, String description, String category, String publishDate) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.description = description;
        this.category = category;
        this. publishDate = publishDate;
    }

    // 읽기접근자 (리턴값있음)
    public String getBookId() { return this.bookId; }
    public String getTitle() { return this.title; }
    public int getPrice() { return this.price; }
    public String getAuthor() { return this.author; }
    public String getDescription() { return this.description; }
    public String getCategory() { return this.category; }
    public String getPublishDate() { return this.publishDate; }

    // 쓰기접근자 (데이터받음, 리턴없음)
    public void setBookId(String bookId) { this.bookId = bookId; }
    public void setPrice(int price) { this.price = price; }
    public void setDescription(String description) { this.description = description; }
    public void setCategory(String category) { this.category = category; }
    public void setPublishDate(String publishDate) { this.publishDate = publishDate; }



}

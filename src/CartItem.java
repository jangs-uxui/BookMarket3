public class CartItem { // DTO (카드에 담길 객체 생성)

    // 멤버변수
    private Book book; // Book객체
    private int count; // 수량
    private int totalPrice; // 합계금액

    // 생성자(멤버변수 초기값)
    public CartItem(Book book, int count) { // 책이 여러권 추가될 때 (Book객체와 수량 받아옴)
        this.book = book;
        this.count = count;
        this.updateTotalPrice();
    }
    public CartItem(Book book) { // 책이 한권 추가될 때 (Book객체만 받아옴)
        this.book = book;
        this.count = 1;
        this.updateTotalPrice();
    }

    // 읽기접근자 (리턴)
    public Book getBook() { return this.book; }
    public int getCount() { return this.count; }
    public int getTotalPrice() { return this.totalPrice; }

    // 쓰기접근자 (데이터받음)
    public void setCount(int count) { // 수량 받아와 적용, 합계금액에 적용
        this.count = count;
        this.updateTotalPrice();
    }

    // 합계금액 계산
    public void updateTotalPrice() {
        this.totalPrice = this.book.getPrice() * this.count; // 책가격 * 수량
    }



}

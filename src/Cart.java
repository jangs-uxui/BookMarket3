public class Cart { // 카트관련 기능

    // 멤버변수
    private CartItem[] mCart = new CartItem[3]; // CartItem객체 '배열'로 생성
    private int mCartItemCount = 0; // 객체 항목 개수 (총 권수 X)

    public boolean isCartInBook(String bookId) { // 해당 bookId 카트속에 있는지, boolean 반환
        for (int i = 0; i < this.mCartItemCount; i++) {
            if ( bookId.equals(this.mCart[i].getBook().getBookId()) ) { // bookId == mCart i번째 Book객체의 bookId
                return true; // true 반환과 메써드 종료
            }
        }
        return false; // for문 돌 동안 일치하는게 없으면 false 반환
    }

    public void clearCart() { // 카트비우기
        this.mCart = new CartItem[3]; // 새로운 빈 배열 배열 생성 (초기화)
        this.mCartItemCount = 0;
    }

    // ??
    public Book removeCartItem(String bookId) { // bookId일치하는 CartItem객체 삭제 (*책이 카트에 1권 있을 때)
        Book book = null; // 삭제할 책 객체를 저장할 변수 선언
        for (int i = 0; i < this.mCartItemCount; i++) { // mCartItemCount 만큼 for문 돌림
            if (this.mCart[i].getBook().getBookId().equals(bookId)) { // i번째 CartItem객체배열 Book객체의 bookId == bookId
                book = this.mCart[i].getBook(); // 삭제할 책 Book객체 book변수에 저장
                this.removeCartItem(i); // i번째 장바구니 항목 제거
                break; // for문 탈출
            }
        }
        return book; // 삭제한 책 객체 반환 (못찾으면 null)
    }
    private void removeCartItem() { // [오버로딩] 카트 항목 삭제 (책이 카트에 1권 있을 때)
        // CartItem[] 배열에서 index부분 삭제 후 이후 원소 한칸식 당김
        // 작업중..
    }






}

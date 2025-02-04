package sourcecode.session1.class1.ex.movieReview;

public class MovieRevieMain1 {

    public static void main(String[] args) {

        MovieReview movieReview = new MovieReview();
        movieReview.title = "인셉션";
        movieReview.review = "인생은 무한 루프";

        System.out.println("영화 제목: " + movieReview.title + ", 리뷰 : " + movieReview.review);
    }

}

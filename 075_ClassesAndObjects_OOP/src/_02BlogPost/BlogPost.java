package _02BlogPost;


public class BlogPost {
//    an authorName
//    a title
//    a text
//    a publicationDate
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public BlogPost() {
    }
}

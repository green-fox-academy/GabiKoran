package _02BlogPost;


public class BlogPost {
//    an authorName
//    a title
//    a text
//    a publicationDate
    public String authorName;
    public String title;
    public String text;
    public String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public BlogPost() {
    }

    @Override
    public String toString() {
        return title;
    }
}

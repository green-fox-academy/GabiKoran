package _13Blog;

import _02BlogPost.BlogPost;

public class Main {
    public static void main(String[] args) {

        Blog testBlog = new Blog();

        BlogPost post1 = new BlogPost("Aranka", "A", "aaaaaaaa", "2019.11.20.");
        BlogPost post2 = new BlogPost("Blanka", "B", "bbbbbbbb", "2019.11.20.");
        BlogPost post3 = new BlogPost("Cecília", "C", "cccccccc", "2019.11.20.");
        BlogPost post4 = new BlogPost("Daniella", "D", "dddddddd", "2019.11.20.");
        BlogPost post5 = new BlogPost("Eleonóra", "E", "eeeeeeee", "2019.11.20.");

        testBlog.add(post1);
        testBlog.add(post2);
        testBlog.add(post3);
        testBlog.add(post4);
        testBlog.add(post5);

        System.out.println(testBlog);

        testBlog.delete(3);

        System.out.println(testBlog);

        BlogPost post6 = new BlogPost("Fanni", "F", "ffffffff", "2019.11.20.");
        testBlog.update(3, post6);

        System.out.println(testBlog);
    }


}

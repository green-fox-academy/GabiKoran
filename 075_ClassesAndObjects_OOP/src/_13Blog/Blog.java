package _13Blog;

import _02BlogPost.BlogPost;

import java.util.ArrayList;
import java.util.List;

public class Blog {

//    store a list of BlogPosts
//    add BlogPosts to the list
//    delete(int) one item at given index
//    update(int, BlogPost) one item at the given index and update it with another BlogPost

    List<BlogPost> nameOfBlog;

    public Blog() {
        this.nameOfBlog = new ArrayList<>();
    }

    public void add(BlogPost blogpost) {
        nameOfBlog.add(blogpost);
    }
    //public void add(Thing thing) {
    //        things.add(thing);
    //    }

    public void delete(int i) {
        nameOfBlog.remove(i);
    }

    public void update(int i, BlogPost resettingPost) {
        nameOfBlog.set(i, resettingPost);
    }

    public int size() {
        return nameOfBlog.size();
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < nameOfBlog.size(); i++) {
            result += nameOfBlog.get(i) + " ";
        }
        return result;
    }
}

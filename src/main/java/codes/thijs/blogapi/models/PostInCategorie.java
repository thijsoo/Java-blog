package codes.thijs.blogapi.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PostInCategorie {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne()
    private Categories categories;


    @ManyToOne()
    private Post post;


    public Long getId() {
        return id;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}

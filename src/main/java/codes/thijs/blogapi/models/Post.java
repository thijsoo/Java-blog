package codes.thijs.blogapi.models;

import javax.persistence.*;

@Entity
public class Post extends AbstractAuditableModel {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String subTitle;
    @Column(columnDefinition="TEXT")
    private String content;

    @ManyToOne()
    private Author author;

    @ManyToOne()
    private SeoTags seoTags;


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    public SeoTags getSeoTags() {
        return seoTags;
    }

    public void setSeoTags(SeoTags seoTags) {
        this.seoTags = seoTags;
    }
}

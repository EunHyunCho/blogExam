package my.examples.blogExam.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Long id;
    private String title;
    private String content;
    private Date createDate;
    private Long readCount;

    private Category category;
    private List<Comment> commentList;
    private List<ImageFile> imageFiles;

    public Post() {
        commentList =  new ArrayList<>();
        imageFiles =  new ArrayList<>();
        readCount = 0L;
        createDate = new Date();
    }
}

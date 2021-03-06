package my.examples.blogExam.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog {
    private Long id;
    private String name;
    private String url;
    private Date createDate;

    private Account account;
    private List<Category> categoryList;

    public Blog() {
        createDate = new Date();
        categoryList =  new ArrayList<>();
    }
}

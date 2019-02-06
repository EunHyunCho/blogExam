package my.examples.blogExam.domain;

import java.util.Set;

public class Category {
    private Long id;
    private String name;

    private Blog blog;
    private Set<Post> post;
}

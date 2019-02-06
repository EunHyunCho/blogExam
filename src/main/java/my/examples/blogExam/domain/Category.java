package my.examples.blogExam.domain;

import java.util.HashSet;
import java.util.Set;

public class Category {
    private Long id;
    private String name;

    private Blog blog;
    private Set<Post> post;

    //카테고리가 없는 글은 입력할 수 없도록 만들기 or 자동으로 목록없음 카테고리를
    //블로그 생성시에 자동생성되게해서 그곳으로 가도록 만들기.
    public Category() {
        post = new HashSet<>();
    }
}

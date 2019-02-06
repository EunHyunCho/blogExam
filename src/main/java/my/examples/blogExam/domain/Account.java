package my.examples.blogExam.domain;

import java.util.Date;
import java.util.Set;

public class Account {
    private Long id;
    private String name;
    private Date createDate;
    private String nickname;
    private String passwd;
    private String email;

    private Blog blog;
    private Set<Role> role;
}

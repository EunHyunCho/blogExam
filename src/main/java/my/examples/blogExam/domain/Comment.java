package my.examples.blogExam.domain;

import java.util.Date;

public class Comment {
    private Long id;
    private String content;
    //Date는 출력에 시간도 같이 출력되어야 한다.
    private Date wirteDate;

    private Account account;
    private Post post;
}

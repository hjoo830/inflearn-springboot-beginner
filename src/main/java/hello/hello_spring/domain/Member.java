package hello.hello_spring.domain;

public class Member {
    private Long id; // 고객이 지정한 id 아니고 시스템이 지정하는 id
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    // JPQL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}

/*
스프링 데이터 JPA 제공 기능
- 인터페이스를 통한 기본적인 CRUD
- findByName() , findByEmail() 처럼 메서드 이름만으로 조회 기능 제공
- 페이징 기능 자동 제공
*/

package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // Optional은 찾는 값이 없어서 null이 반환될때 처리
    Optional<Member> findByName(String name);
    List<Member> findAll();
}

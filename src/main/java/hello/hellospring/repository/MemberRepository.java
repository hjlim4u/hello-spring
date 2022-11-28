package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //없으면 null 그대로 반환하는 것이 아닌 optional로 감싸서 처리
    Optional<Member> findByName(String name);
    List<Member> findAll();
}

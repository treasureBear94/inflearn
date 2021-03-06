package hello.core.member;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2021/03/18
 */
public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}

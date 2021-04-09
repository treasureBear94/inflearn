package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2021/03/27
 */
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(final Member member, final int price) {
        if(member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }

}
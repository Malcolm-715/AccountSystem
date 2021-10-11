package za.ac.nwu.ac.domain.persistence;

import za.ac.nwu.ac.domain.dto.MemberDto;

import java.util.Objects;

public class Member extends MemberDto {

    public Long memberId;
    public String memberName;

    public Member(){}

    public Member(Long memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }


    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(memberId, member.memberId) && Objects.equals(memberName, member.memberName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, memberName);
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }
}

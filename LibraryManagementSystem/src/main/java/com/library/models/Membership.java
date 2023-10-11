package com.library.models;

public class Membership {

	private int memberId;
	private String memberName;

	public Membership(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	

	@Override
	public String toString() {
		return "Membership [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
}

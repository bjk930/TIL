package com.lect.ex04_object;

public class Card {
	private char kind; //♡♤♧◇
	private int num; //1~13
	public Card(char kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	@Override
	public String toString() {
		return "카드는 "+kind+" "+num;
	}
	@Override
	public boolean equals(Object obj) {
		//(c1.equals(c2) -> c1과 c2가 같은 카드면 true, 틀린 카드면 false.
		if(obj!=null&&obj instanceof Card) {
			boolean kindChk = kind==((Card)obj).kind;
			boolean numChk = num==((Card)obj).num;
			return kindChk&&numChk;
		}
		return false;
	}
}

package com.lect.ex02_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FriendStringBuilderEx1error extends FriendStringBuilder {
	public static void main(String[] args) {
		FriendStringBuilder[] fs= {new FriendStringBuilder(new StringBuilder("��"), new StringBuilder("111-1111"), new StringBuilder("05-25")),
		new FriendStringBuilder(new StringBuilder("��"), new StringBuilder("222-2222"), new StringBuilder("04-25")),
		 new FriendStringBuilder(new StringBuilder("��"), new StringBuilder("222-2222"), new StringBuilder("05-25"))};
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		int k=0;
		for(FriendStringBuilder temp : fs) {
			System.out.println(temp);
			if(temp.getBirthday().equals(new StringBuilder(sdf.format(date)))) {//��Ʈ�������� ��Ʈ������ �ٲ� ���� ����?
				System.out.println(temp);
			}
			else {
				k++;
			}
		}
		
			
	//	}
		if(k==fs.length) {
			System.out.println("������ ����.");
		}
	
	}
	
}
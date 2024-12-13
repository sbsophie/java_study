package com.gn.practice09.run;

import java.util.HashMap;
import java.util.Map;

import com.gn.practice09.model.vo.Information;

public class Run {
	public static void main(String[] args) {
		Map<String,Information> info = new HashMap<String,Information>();
		info.put("John", new Information("123-456-7890",3800000));
		info.put("Emma", new Information("987-654-3210",2300000));
		info.put("Tom", new Information("555-123-4567",4600000));
		System.out.println("변경전 : "+info);

		info.put("John",new Information("123-456-7890",4100000));
		
		System.out.println("===== Emma의 정보 =====");
		info.get("Emma").setPhone("111-111-1111");
		System.out.println(info.get("Emma"));
		
//		선생님 답안은 이렇게 출력!
//		System.out.println("전화번호 : "+info.get("Emma").getPhone());
		
		System.out.println("변경후 : "+info);
		
	}
}

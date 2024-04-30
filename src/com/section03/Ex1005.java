package com.section03;

public class Ex1005 {

	public static void main(String[] args) {
		System.out.println(Math.abs(-10)); // 절대값
		System.out.println(Math.round(4.5));
		System.out.println(Math.sqrt(9.0)); // 결과 3.0
		System.out.println(Math.pow(5,3)); // 5^3
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.round(4.5)); // 제일 가까운 정수
		System.out.println(Math.ceil(4.1)); // 위에 있는 정수
		System.out.println(Math.floor(4.9)); // 아래 있는 정수
		System.out.println(Math.max(5, 100)); // 100
		System.out.println(Math.min(5,100)); // 5
		System.out.println(Math.random()); // 난수
		
		// 1~100까지 난수 정수 선택하기
		System.out.println(Math.round(Math.random() * 100));
	}

}

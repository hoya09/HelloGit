package main;

import calc.Calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("로컬저장소 사용");
		System.out.println("원격저장소 사용 가능 ");
		System.out.println("원격저장소 사용 가능2 ");
		System.out.println("팀장 코드 시작입니다.");
		System.out.println("팀장 코드 마지막임 ");
		

		System.out.println("팀장 새코드 시작");
		System.out.println("팀장 새코드 끝");

		
		System.out.println("팀원 코드 1");
		System.out.println("팀원 코드 2");
		System.out.println("팀원 코드 3");
		
		Calculator cal = new Calculator();
		int addResult = cal.add(1, 2);
		System.out.println(addResult);
		
		int subResult = cal.sub(2, 1);
		System.out.println(subResult);
		

	}

}

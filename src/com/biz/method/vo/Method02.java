package com.biz.method.vo;

import java.util.*;

public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GradeVO> grades = new ArrayList();

		for (int i = 0; i < 3; i++) {
			System.out.println("현재위치" + i);
			GradeVO gradeVO = new GradeVO();
			// if (makeScore(gradeVO) == false) {
			if (!makeScore(gradeVO)) {

				// makeScore가 실행되는 도중
				// 문제가 발생하면
				// false를 return할 것이고
				// i값을 1개 감소한 다음
				// 다시 for로 되돌아가서
				// 현재 학생의 점수를 다시 입력받도록 시도.
				i--;
				continue;
			}
			// makeScore가 정상적으로 실행되서
			// 최종 true를 return한 경우에는
			// list를 하나 추가.
			grades.add(gradeVO);
		}

	}

	public static boolean makeScore(GradeVO gradeVO) {
		GradeVO gardeVO = new GradeVO();
		Scanner scanner = new Scanner(System.in);
		boolean retOk = true;

		System.out.print("학번 >>");
		String strNum = scanner.nextLine();

		System.out.print("이름 >>");
		String strName = scanner.nextLine();

		System.out.print("국어 >>");
		String strKor = scanner.nextLine();

		System.out.print("영어 >>");
		String strEng = scanner.nextLine();

		System.out.print("수학 >>");
		String strMath = scanner.nextLine();
		try {
			gradeVO.setIntKor(Integer.valueOf(strKor));
			gradeVO.setIntKor(Integer.valueOf(strEng));
			gradeVO.setIntKor(Integer.valueOf(strMath));

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("과목점수 변경 오류");
			retOk = false;
		}
		return retOk;
	}

}

package java0517;

public class If_ex3 {

	public static void main(String[] args) {
		// 국어성적을 출력하기
		// 100점인 학생에게 "축하합니다" 메세지 띄우기
		
		int kor=100;
		
		System.out.println("당신의 국어 : "+kor);
		
		if(kor == 100)
		{
			System.out.println("축하합니다");
		}
		else // else 일때 실행할 문장이 없으면 생략이 가능하다.
		{
			
		}
	}

}

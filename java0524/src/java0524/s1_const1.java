package java0524;

public class s1_const1 {
	// n부터 100까지의 합을 구하기
	int n;
	int hap;
	// 프로그램 실행시 꼭 필요한 값,동작이 필요할경우
	s1_const1(int n)
	{
		this.n=n;
	}
	public void cal()
	{
		for(int i=n; i<=100; i++)
		{
			hap=hap+i;
		}
	}
	public void output()
	{
		System.out.println(hap);
	}

}

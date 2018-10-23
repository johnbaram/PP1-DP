package edu.handong.csee.pp1.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testMain() {
		// Put a GitHub repository path you cloned in your laptop.
		// \\는 윈도우즈 경로의 \가 특수문자라 제대로된 문자로 표시하기 위해 \\ 이렇게 쓰는 것임.
		// TASK1 TODO 아래 args적절히 수정. MetricCollector.java를 완성하면, arff파일에 다양한 값들을 볼 수 있음.
		// (1) 첫번째 파라미터: 현재 수정하고자 하는 PP1-DP의 경로를 값으로 할당 (본인의 경로에 맞게 적당히 수정)
		// (2) 두번째 파라미터: 첫번째 파라미터에 넣은 git 레포지토리에서 최종 생성된 training data file이름. data/로 시작해야 함.
		String[] args = {"C:\\Users\\johnb\\PP1-DP","data/PP1-DP.arff"};
		// String[] args = {"/use/this/style/for/your/path"}; // for mac users
		
		assertEquals(args.length,2);
		
		Main.main(args);
	}
	
	@Test
	public void testForTasks2_1() {
		String[] args = {"C:\\Users\\johnb\\PP1_DP_testForTask2_1","data/PP1_DP_testForTask2_1.arff"};
		// String[] args = {"/use/this/style/for/your/path"}; // for mac users
		
		assertEquals(args.length,2);
		
		Main.main(args);
	}
	@Test
	public void testForTasks2_2() {
		String[] args = {"C:\\Users\\johnb\\pp1_java_gitgitgit\\PP1_DP_testForTask2_2","data/PP1_DP_testForTask2_2.arff"};
		// String[] args = {"/use/this/style/for/your/path"}; // for mac users
		
		assertEquals(args.length,2);
		
		Main.main(args);
	}
}
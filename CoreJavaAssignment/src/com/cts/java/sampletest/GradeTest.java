package com.cts.java.sampletest;

import com.cts.java.sample.Grade;
public class GradeTest 
{

	public static void main(String[] args)
	{ 
		Grade gradeobj=new Grade();
		String[] grade= {"","Fail","B+","B","A-","A+","A"};
		gradeobj.average(90,80,70);
	}

}

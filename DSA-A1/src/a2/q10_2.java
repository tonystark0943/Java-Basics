package a2;
import a2.*;

public class q10_2 implements Sports{

	public static void main(String[] args) {
		Test t2 = new Test();
		t2.inputDetails();
		t2.showDetails();
		int total_mark=(t2.mark1+t2.mark2)/2;
		Result r1 = new Result();
		System.out.println("Total marks: "+total_mark);
		System.out.println("Total score: "+r1.total_score);
	}

}

interface Sports{
	int score1=20,score2=90;
}

class Result implements Sports{
	int total_score=(score1+score2)/2;
}
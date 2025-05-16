
public class test {
	
	static int x=65;
	static double y=78.16;
	static boolean z=true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test ob = new test();
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
		test2 obj1 = new test2(10);
		test2 obj2 = new test2(30);
		obj1.link = obj2;
		test2 obj3 = new test2(50);
		obj2.link = obj3;
		System.out.println(obj1.a);
		System.out.println(obj1.link.a);
		System.out.println(obj2.link.a);
		
		System.out.println(obj1.link);
		System.out.println(obj2.link);
	}
	
//	test(){
//		x=29;
//		y=45.69;
//		z=false;
//	}
	
}

class test2{
	int a;
	test2 link;
	
	test2(int a){
		this.a=a;
		this.link=null;
	}
	
	void show() {
		System.out.println(a);
	}
}
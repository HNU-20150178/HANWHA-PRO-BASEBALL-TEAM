//메소드 오
class AA{
	public void add(int a, int b) {
		
	}
	public int add(int a, double b) {
		
		return 0;
	}
	public void add(int a , int b , int c) {
		int s = a+b+c;
	}
	public void add2(int ... a) {   // 가변인자 선언 배열이 된다. 가변인자는 이름을 다르게 선언한다.
		int s = 0;
		for(int x=0; x<=a.length; x++) {
			s+=a[x];
		}
		System.out.println(s);
	}
	public void add3(int[] a) {
		int s=0;
		for(int x=0; x<a.length; x++) {
			s+=a[x];
		}
		System.out.println(s);
	}
}
public class E03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA();
		a.add(1, 2);
		a.add(1,2,3);
		a.add2(1,2,3,4);
		a.add2(1,2,3,4,5,6,7,6,4,3,2,1);
		int[] s = {1,2,3,4,5,6};
		a.add3(s);
	}

}

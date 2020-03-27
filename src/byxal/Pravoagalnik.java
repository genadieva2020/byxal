package byxal;

public class Pravoagalnik implements Figurence{
	
	private int a;
	private int b;
	
	public Pravoagalnik(int a, int b){
		this.a=a;
		this.b=b;
	}
		public int getA(){
			return a;
		}
		public void setA(int a){
			this.a=a;	
	}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		
		public int Lice(){
			return getA()*getB();
		}

}

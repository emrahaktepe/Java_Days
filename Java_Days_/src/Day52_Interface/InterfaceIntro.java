package Day52_Interface;

public interface InterfaceIntro {

//	public void methodB() {
//		
//	}

	public static void mm() {

	}

	public default void methodC() {

	}

	public abstract void methodA();

	interface Data {

	}

//	class Test implements InterfaceIntro, Data{
//	//	sub type			super type 1 	2	
//		@Override
//		public void methodA() {
//			
//		}
	class D {
		static {
			int a = 500;
		}
	}

	int a = 100;
	public static final int b = 200;

	public static void main(String[] args) {

		InterfaceIntro.mm();

		System.out.println(a);

		// a = 200; // variables are final by default

	}

}

package main;

public class Discussion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Say hello = new SayHello();
		hello.tellMe();
		hello = new SayAnything( "Whats up?" );
		hello.tellMe();
	}

}

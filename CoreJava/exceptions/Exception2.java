package exceptions;

public class Exception2 {

	public static void main(String[] args) {

		try {

			int value[] = new int[6];

			value[2] = 4 / 0;

			System.out.println(value[3]);

		} catch (ArithmeticException a) {
			System.out.println("16.don't enter 0 as the denominator");
		}

		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("20.Index 20 out of bounds for length 6");
		} catch (Exception e) {
			System.out.println("2.It's out of range");

			System.out.println(e);
		}

	}

}

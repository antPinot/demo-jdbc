package fr.diginamic.jvm;

public class TestMemoire {

	public static void main(String[] args) {
		boolean infiniteLoop = true;
		int i = 0;
		int j = 0;
		StringBuilder builder = new StringBuilder();

		while (infiniteLoop) {
			builder.append(i);
			i++;
			if (i == 10000) {
				i = 0;
				j++;
				System.out.println(j + " occurences");
				System.out.println("On est là\n");

			}

		}

	}

}

package bookExercises;

import javax.swing.JOptionPane;

public class Ex84methods {

	public void cattle() {

		int randomValue = (int) ((Math.random() * 100) + 1);

		int[] cattleWeigth = new int[randomValue];

		int sum = 0, arithmeticMean;

		for (int i = 0; i < cattleWeigth.length; i++) {

			cattleWeigth[i] = (int) (Math.random() * 100);

			sum += cattleWeigth[i];

			System.out.print(cattleWeigth[i] + " | ");

		}

		arithmeticMean = sum / cattleWeigth.length;

		JOptionPane.showMessageDialog(null, "Average weight of cattle: " + arithmeticMean);
	}

	public void goat() {

		int randomValue = (int) ((Math.random() * 100) + 1);

		int[] goatWeigth = new int[randomValue];

		int sum = 0, arithmeticMean;

		for (int i = 0; i < goatWeigth.length; i++) {

			goatWeigth[i] = (int) (Math.random() * 100);

			sum += goatWeigth[i];

			System.out.print(goatWeigth[i] + " | ");

		}

		arithmeticMean = sum / goatWeigth.length;

		JOptionPane.showMessageDialog(null, "Average weight of cattle: " + arithmeticMean);

	}
	
	
	public void sheep() {
		
		int randomValue = (int) ((Math.random() * 100) + 1);

		int[] sheepWeigth = new int[randomValue];

		int sum = 0, arithmeticMean;

		for (int i = 0; i < sheepWeigth.length; i++) {

			sheepWeigth[i] = (int) (Math.random() * 100);

			sum += sheepWeigth[i];

			System.out.print(sheepWeigth[i] + " | ");

		}

		arithmeticMean = sum / sheepWeigth.length;

		JOptionPane.showMessageDialog(null, "Average weight of cattle: " + arithmeticMean);
	}
}

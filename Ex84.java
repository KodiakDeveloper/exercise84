package bookExercises;

import javax.swing.JOptionPane;

public class Ex84 {

	public static void main(String[] args) {

		String userAnswer, animal;

		Ex84methods ex = new Ex84methods();

		do {

			animal = JOptionPane.showInputDialog(null,
					"Insert the animal: " + "\nAvailable Options: " + "cattle," + "goat," + "sheep");

			if (animal.isEmpty()) {

				JOptionPane.showMessageDialog(null, "Input cannot be empty");
			}

			else {

				animal = animal.trim();

				animal = animal.toLowerCase();

				switch (animal) {

				case "cattle":

					ex.cattle();

					break;

				case "goat":

					ex.goat();

					break;

				case "sheep":

					ex.sheep();

					break;

				default:

					JOptionPane.showMessageDialog(null, "No animal was selected.");
				}

			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");

	}

}

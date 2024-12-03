package org.acumen.training.codes.gradebook;

public class Gradebook {

	private double[] grades = new double[0];

	/*
	 * This prints the grades
	 */
	public void printGrades() {
		if (grades.length == 0) {
			System.out.println("No grades available.");
		} else {
			for (double grade : grades) {
				System.out.print(grade + " ");
			}
			System.out.println();
		}
	}

	/*
	 * This computes the average
	 */
	public double computeAve() {
		if (grades.length == 0) {
			return 0.0;
		}
		double sum = 0.0;
		for (double grade : grades) {
			sum += grade;
		}
		return sum / grades.length;
	}

	/*
	 * This adds input to array grades
	 */
	protected void addGrade(double newGrade) {
		double[] temp = new double[grades.length + 1];

		System.arraycopy(grades, 0, temp, 0, grades.length);

		temp[grades.length] = newGrade;

		grades = temp;
	}

	/*
	 * This deletes grades similar to input
	 */
	protected void deleteGrade(double grade) {

		int count = 0;
		for (double g : grades) { // use g to traverse to array grade to check for similarity
			if (g == grade) {
				count++;
			}
		}

		if (count == 0) { // if there are no similar grade to the input
			System.out.println("Grade " + grade + " not found.");
			return;
		}

		double[] temp = new double[grades.length - count];
		int index = 0;

		for (double g : grades) { // if g is not similar to input, add to edited list of grades
			if (g != grade) {
				temp[index++] = g;
			}
		}

		grades = temp;
	}
}

package NewSwing.Swing15_RadioButtons;

public class AMain {
	public void bubbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {
		MyFrame my = new MyFrame();
	}
}
import java.util.ArrayList;
import java.util.Arrays;

class Ch12Test4 {
	public static void main(String[] args) {
		double[] array = {1, 2, 3};
		ArrayList list = new ArrayList<>(Arrays.asList(array));
		System.out.println(list);
	}
}
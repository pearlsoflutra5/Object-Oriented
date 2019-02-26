class Ch12Test7 {
	public static void main(String[] args) {
		try {
			String s = "5.6";
			Integer.parseInt(s); // Cause a NumberFormatException
			int i = 0;
			int y = 2 / i;
		}
		
		catch (Exception ex) {
			System.out.println("NumberFormatException");
		}
		
		catch (RuntimeException ex) {
			System.out.println("RuntimeException");
		}

	}
}
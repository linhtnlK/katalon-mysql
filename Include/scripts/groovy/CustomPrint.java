public class CustomPrint {
	public static void print(String text) {
		System.out.println("------------------");
		System.out.print(text.substring(0, 30000));
		System.out.print(text.substring(30000, text.length()));
//		int maxSize = 30000;
//				int cursor = 0;
//				while (cursor < text.length()) {
//				    int start = cursor;
//
//				    cursor += maxSize;
//
//				    if (cursor > text.length()) {
//				        cursor = text.length();
//				    }
//				    
//				    System.out.print(text.substring(start, cursor));
//				};
	}
}
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


class KatalonCustomKeywords {
	/**
	 * Separate a large text into small
	 * @param text the text 
	 */
	@Keyword
	def customPrint(String text) {
		println '--------------------------------------'
		int maxSize = 30000;
		int counter = 0;
		while(counter<text.length()) {
			int start = counter;
			counter += maxSize;
			if(counter > text.length()) {
				counter= text.length();
			}
			printLinhTo text.substring(start,counter);
		}
		println '--------------------------------------'
	}
	
	def printLinhTo(String text) {
		print text
	}
}
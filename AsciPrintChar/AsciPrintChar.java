
import external.*
class A {

	static char scanChar(String s){
		for (char alphabet = 'A'; alphabet = 'Z'; alphabet++){
			String graph = AsciiArt.printChar(alphabet);
			if (s.equals(graph))
				return alphabet;
		}
		return '?';
		
	}
}
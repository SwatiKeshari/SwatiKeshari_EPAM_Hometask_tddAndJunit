package junit;

public class Delete2chars {
	
	public String del(String string) {
		String result = string;
		int stringlength = string.length();
		if(string.charAt(0)=='A'&& string.charAt(1)=='A') {
			String s = string.substring(2);
			return s;
		}
		else if(string.charAt(1)=='A') {
			String s = string.substring(1,2);
			return s;
		}
		else if(string.charAt(0)=='A') {
			String s = string.substring(1);
			return s;
		}
		else
			return result;
	}

}

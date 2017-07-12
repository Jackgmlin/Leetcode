public class Solution {
    public String reverseString(String s) {
          if (null == s || s.length() <= 1) {
	     return s;
	  }
          char[] array = s.toCharArray();
	  int i = 0;
	  int j = s.length() - 1;
	  while (i < j) {
  	    char temp = array[i];
  	    array[i] = array[j];
  	    array[j] = temp;
  	    i++;
  	    j--;
	  }
	  return new String(array);
    }
}

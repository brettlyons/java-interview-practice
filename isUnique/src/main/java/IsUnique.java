import java.util.Arrays;

// Test if a string has all unique characters

class IsUnique {

  public boolean testUniqueness(String str1) {
    
    for(int i = 0; i < str1.length() ; i++) {
      for(int j = i+1 ; j < str1.length() - 1 ; j++) {
        if(str1.charAt(i) == str1.charAt(j)) {
          return false;
        }
      }
    }
    return true;
    
    // if(str1.length() != str2.length()) {
    //   return true;
    // }
    
    // char[] tmpChar1 = str1.toCharArray();
    // char[] tmpChar2 = str2.toCharArray();

    // Arrays.sort(tmpChar1);
    // Arrays.sort(tmpChar2);

    // return tmpChar1.equals(tmpChar2);
  }
}

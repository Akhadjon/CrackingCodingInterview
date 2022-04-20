package ArraysAndStrings;

public class ArraysAndStrings {

  static  boolean isUniqueChars(String word){
        if(word.length()>128) return false;
        boolean[] char_set = new boolean[128];
        for(int i=0; i<word.length(); i++){
          int value = word.charAt(i);
            if(char_set[value]){
                return  false;
            }
          char_set[value] = true;
        }
        return true;
    }

    static boolean permutation(String s, String t){
      if(s.length()!=t.length()) return false;
      int letters[] = new int[128];
      char[] s_array = s.toCharArray();
      for(char c:s_array){
          letters[c]++;
      }
      for(int i=0; i<t.length(); i++){
          int c=t.charAt(i);
          letters[c]--;
          if(c<0){
              return  false;
          }
      }
      return true;
    }

    static void urlify(char[] str, int size){
      int spaceCount=0, index;
    for(char c:str){
        if(c==' ') spaceCount++;
    }

    index = size + spaceCount*2;

    if(size<str.length) str[size] = '\0';
    for(int i=size; i>0; i--){
        if(str[i]==' '){
            str[index-1] = '0';
            str[index-2] = '2';
            str[index-3] = '%';
            index -=3;
        }else {
            str[index-1] = str[i];
            index--;
        }

    }
    }

    public static void main(String[] args) {
        System.out.println(isUniqueChars("hello"));
    }
}

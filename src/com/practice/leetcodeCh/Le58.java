package leetcodeCh;

public class Le58 {

    public static void main(String[] args) {
        System.out.println(Le58.lengthOfLastWord("js tess "));
    }

    static int lengthOfLastWord(String s){
        System.out.println(s);
        s = s.trim();
        int finalWordLen = 0;
        int size = s.length()-1;
        for(int i = size; i >= 0; i--){
          if(s.charAt(i) == ' '){
              return finalWordLen;
          }else{
              finalWordLen++;

          }
        }
        return finalWordLen;
    }

}

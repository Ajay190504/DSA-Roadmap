public class WhiteSpace {

    public static void main(String args[]) {

        String str = " A j ay ";

        char[] ch = str.toCharArray();
        String result = "";

        for (int i = 0; i < ch.length; i++) {
           if(ch[i]!=' '){
            result=result+ch[i];
           }
        }

        System.out.println(str);
        System.out.println(result);
    }
}
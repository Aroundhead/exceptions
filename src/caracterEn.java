public class caracterEn {
    static char caracterEn(String s, int i) throws Exception{
        if(i > s.length()) {
            throw new Exception();
        }
        return s.charAt(i);
    }
}


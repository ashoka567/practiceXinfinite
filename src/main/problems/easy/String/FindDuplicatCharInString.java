package problems.easy.String;

public class FindDuplicatCharInString {

    /**
     *
     * @param str
     * @return
     */
    public boolean hasDuplicate(String str){
        if(null == str || (str != null && str.isEmpty())){
            return false;
        }

        boolean[] b = new boolean[128];// having loop of booleans for ascii, so that if we have boolean true then return . codePointAt() will give the ascii code char.

        for (int i = 0; i < str.length(); i++) {
            int c = str.codePointAt(i);
            if(b[c]){
                return false;
            }
            b[c]= true;
            System.out.println(c);
        }

        return false;
    }

    public static void main(String[] args) {
        FindDuplicatCharInString d = new FindDuplicatCharInString();
        d.hasDuplicate("abab");
    }
}

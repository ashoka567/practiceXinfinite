package problems.easy.String;

/**
 * Not solved yet
 */
public class DefangingIPAddress {
    public String defangIPaddr(String address) {
        StringBuffer sb = null;
        if(address != null){
            sb = new StringBuffer(address);
            for (int i = 0; i < sb.length()-1; i++) {
                System.out.println(i+ " - "+sb.length());
                Character c = sb.charAt(i);
                if( Character.valueOf('.').equals(c)){ // Char value of string
                    sb = sb.replace(i, i+1, "[.]");
                    ++i;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        DefangingIPAddress defangingIPAddress = new DefangingIPAddress();
        System.out.println(defangingIPAddress.defangIPaddr("1.1.1.1"));
        //1[.]1[.]1[.]1
    }

}

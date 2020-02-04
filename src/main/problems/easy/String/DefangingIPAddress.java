package problems.easy.String;

/**
 * Not solved yet
 */
public class DefangingIPAddress {
    public String defangIPaddr(String address) {
        StringBuffer sb = null;
        if(address != null){
            sb = new StringBuffer(address);
            for (int i = 0; i < sb.length(); i++) {
                Character c = address.charAt(i);
                if( Character.valueOf('.').equals(c) && i < address.length()-1){
                    sb = sb.replace(i, i+1, "[.]");
                    i = i+2;
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

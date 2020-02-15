package problems.easy.String;

public class StringIntern {

    public void testString(){
        String s = new String("ABC");
        /**
         * Look at from string pool.
         */
        s.intern(); //native method. native keyword, we're successfully able to access a platform-dependent implementation
    }
}

/**
 * Counts the number of dots "." in a string.
 * @param s  string to count dots from
 * @return  number of dots
 */
public static int countDots(final String s){
    int count = 0;
    for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == '.') {
            count++;
        }
    }
    return count;
}
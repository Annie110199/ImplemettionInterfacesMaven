public class FilterContains implements IFilter {
    String pattern;
    public boolean apply(String str) {
        if ( str.indexOf(pattern)>=0) return true;
        else return false;
    }
}

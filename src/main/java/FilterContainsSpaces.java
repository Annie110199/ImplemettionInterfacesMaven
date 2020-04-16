public class FilterContainsSpaces implements IFilter {

    public boolean apply(String str) {
        for (int i = 0; i< str.length();++i){
            if(str.charAt(i)==' ')return true;
        }
        return false;
    }
}

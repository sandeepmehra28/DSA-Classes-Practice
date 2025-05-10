package Easy;

import java.util.List;

public class CountItemsMatchingARules {
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ri;
        if(ruleKey.equals("type")){
            ri=0;
        }else if(ruleKey.equals("color")){
            ri=1;
        }else{
            ri=2;
        }
        int count=0;
        for(List<String>item:items){
            if(item.get(ri).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}

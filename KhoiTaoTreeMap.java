import java.util.HashMap;

public class KhoiTaoTreeMap {
    public static void main(String[] args) {
        String st = "abcdabhaacaaa";
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();

        for (int i=0;i<st.length();i++){
            if (map1.containsKey(st.charAt(i))){
                map1.replace(st.charAt(i), map1.get(st.charAt(i))+1);
            } else {
                map1.put(st.charAt(i), 1);
            }
        }
        System.out.println(map1);
    }

}

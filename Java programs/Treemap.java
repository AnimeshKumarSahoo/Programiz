import java.util.TreeMap;
public class Treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
        tm.put("Mason", new Integer(55));
        tm.put("Jacob", new Integer(77));
        tm.put("William", new Integer(99));
        tm.put("Minati", new Integer(65));
        System.out.println("Students count :: " + tm.size());
        for(String key : tm.keySet()){
        System.out.println(key + " score marks :" + tm.get(key));
        }
        System.out.println("Minati score present::" + tm.containsKey("Minati"));
        System.out.println("John score present:: " + tm.containsKey("John"));
        tm.remove("Minati");
        System.out.println("william score present::" + tm.containsKey("William"));
    }       
    
}

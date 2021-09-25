import java.util.HashMap;
import java.util.Map;

final class ImmutableClass {
    private final String name;
    private final int id;
    private Map<String,String> medaData;

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", medaData=" + medaData +
                '}';
    }

    public ImmutableClass(String name, int id, Map<String, String> medaData) {
        this.name = name;
        this.id = id;
        Map<String,String> tempMap = new HashMap<>();

        for(Map.Entry<String,String> entry : medaData.entrySet()){
            tempMap.put(entry.getKey(),entry.getValue());
        }
        this.medaData = tempMap;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Map<String, String> getMedaData() {
        Map<String,String> tempMap = new HashMap<>();
        for(Map.Entry<String,String> entry : medaData.entrySet()){
            tempMap.put(entry.getKey(),entry.getValue());
        }
        return tempMap;
    }
}

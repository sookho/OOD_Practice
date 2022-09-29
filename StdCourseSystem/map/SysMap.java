package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SysMap {
    private Map<Object, List<Object>> map;

    public SysMap(){
        map = new HashMap<>();
    }

    public Map<Object, List<Object>> getMap() {
        return map;
    }

    public void setMap(Map<Object, List<Object>> map) {
        this.map = map;
    }
}

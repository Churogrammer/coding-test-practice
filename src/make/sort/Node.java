package make.sort;

public class Node {
    private Integer key;
    private Object value;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer newKey){
        this.key = newKey;
    }

    public Node(Integer key, Object obj){
        this.key = key;
        this.value = obj;
    }

}

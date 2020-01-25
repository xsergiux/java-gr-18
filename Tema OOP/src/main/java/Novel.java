public class Novel extends Book{
    private String type;

    public Novel(String type){
        this.type = type;
    }

    public Novel() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

package Main;

public class Result {
    public Boolean flag;
    public String wholeName;

    public Result(){
        flag = false;
        wholeName = "";
    }

    public Result(Boolean flag, String wholeName){
        this.flag = flag;
        this.wholeName = wholeName;
    }
}

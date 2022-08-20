package Main;

public class Result {
    public Sanktionslistenentry Entry;
    public Boolean flag;

    public Result(){
        flag = false;
        Entry = null;
    }

    public Result(Boolean flag, Sanktionslistenentry Entry){
        this.flag = flag;
        this.Entry = Entry;
    }
}

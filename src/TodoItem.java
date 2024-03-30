import java.util.UUID;

public class TodoItem implements AppItem {
    private UUID id;
    private String text;
    public TodoItem(){
        this.id = UUID.randomUUID();
    }
    @Override
    public UUID getId(){
    return this.id;
    }
    public String getText(){
        return this.text;
    }
    public void setText(String text){
        this.text=text;
    }

}

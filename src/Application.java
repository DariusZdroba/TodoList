import java.util.ArrayList;
import java.util.List;


public class Application {
    private static List<TodoItem> todoItems = new ArrayList<>();
    public static void startApplication(){
        while(true) {
            ConsoleAction.start();
            OutputType output = ConsoleAction.consoleOperation();
            if ( output == OutputType.Show) {
                printTodoItems(todoItems);
            } else if(output == OutputType.Add) {
                addItem(ConsoleAction.consoleAdd());
            }
            else break;
        }
    }
    private static void printTodoItems(List<TodoItem> items){
        System.out.println("Current todo items: ");
        for(TodoItem todo : items){
            System.out.println(todo.getText());
        }
    }
    private static void addItem(String text){
        TodoItem item = new TodoItem();
        item.setText(text);
        todoItems.add(item);
    }
}

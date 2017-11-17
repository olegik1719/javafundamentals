package se04.task04;
import java.util.TreeMap;
import java.io.Serializable;

public class Actor implements Serializable{
	private String name;
    static private TreeMap<String, Actor> actors;
    static{
        actors = new TreeMap<>();
    }

    /**
        For public using.
        When create -- add actor to base;
    */
    public Actor(String name){
        this.name = name;
        actors.put(name,this);
    }

    /**
        Not use !null! when add clean actor!
    */
    private Actor(){
        name = "This object is temporary";
    }

    /* В связи с тем, что name является уникальным значением для данного класса,
        то смылса его использовать нет, поэтому -- private (для будущего)
    */
    public Actor setName(String newName){
        // Здесь нужна проверка на существование и возврат ошибки, если есть
        // такой же в нашей базе
        // Если актер newName есть, ничего не меняем
        if (!actors.containsKey(newName)){
            // удаляем старую запись
            actors.remove(name);
            name = newName;
            // добавляем новую запись
            actors.put(name,this);
        }
        return this;
    }

    public String getName(){
        return name;
    }

    public static Actor getActor(String name){
        Actor result = new Actor();
        if (actors.containsKey(name)){
            result = actors.get(name);
        }else{
            result = new Actor(name);
        }
        return result;
    }

}

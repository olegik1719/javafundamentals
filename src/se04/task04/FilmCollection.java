package se04.task04;
/* Дана коллекция фильмов, содержащая информацию об актерах,
    снимавшихся в главных ролях (один актер мог сниматься и в нескольких фильмах).
    Необходимо написать приложение, позволяющее при запуске восстанавливать
    коллекцию фильмов, позволять ее модифицировать, а по завершении работы
    приложения – сохранять (в файл). Для восстановления/сохранения коллекции
    использовать  сериализацию/десериализацию.
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.util.ArrayList;

public class FilmCollection implements Serializable{
    private static final long serialVersionUID = 1L;
    private static final String PATH_STRING = "serial.dat";

    ArrayList<Film> filmCollection;
    public FilmCollection(){
        filmCollection = new ArrayList();
    }

    public FilmCollection addFilm(Film film){
        filmCollection.add(film);
        return this;
    }

    public String toString(){
        String result = "";
        for (Film film:filmCollection){
            result += film.toString() + '\n';
        }
        return result;
    }



    public static void main(String[] args) {
        FilmCollection fc = new FilmCollection();
        File file = new File(PATH_STRING);
        try{
            FileInputStream fis = new FileInputStream(PATH_STRING);
                try{
                    ObjectInputStream ois = new ObjectInputStream(fis);
                        try{
                            fc  = (FilmCollection) ois.readObject();
                        } catch (Exception e){
                            System.out.printf("\n!!! There aren't objects, or they are corrupted!!!\n");
                            fc = new FilmCollection();
                        } finally {
                            ois.close();
                        }
                }catch (Exception e){
                    System.out.printf("\n!!! Problem in ObjectInputStream!!!\n");
                    fc = new FilmCollection();
                } finally {
                    fis.close();
                }
        }catch (Exception e){
            System.out.printf("\n!!! Problem with file!!!\n");
            fc = new FilmCollection();
        }

        System.out.printf ("Our collection on START program:\n%s\nIt's all.\n\n",fc);
        //  else
        //      fc = new FilmCollection();
        String[] actors =  {"actor1", "actor2"};
        Film film = new Film("New FILM", actors);
        //film.setName("Other name");
        fc.addFilm(film);

        film = new Film("title");
        fc.addFilm(film);

        System.out.printf ("Our collection on END program:\n%s\nIt's all.\n\n",fc);

        System.out.printf(Actor.getActorsList());
        // try (FileOutputStream fos = new FileOutputStream(PATH_STRING);
        //         ObjectOutputStream oos = new ObjectOutputStream(fos)){
        //     oos.writeObject(fc);
        // }
        try{
            FileOutputStream fos = new FileOutputStream(PATH_STRING);
                try{
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                        try{
                            oos.writeObject(fc);
                        } catch (Exception e){
                            // Не получилось записать
                            System.out.printf("\n!!! Не удалось сохранить!!!\n");
                        } finally {
                            oos.close();
                        }
                }catch (Exception e){
                    System.out.printf("\n!!! Не удалось сохранить!!!\n");
                } finally {
                    fos.close();
                }
        }catch (Exception e){
            System.out.printf("\n!!! Не удалось сохранить!!!\n");
        }
    }

}

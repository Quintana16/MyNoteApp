package practica2.quintana.com.mynoteapp;

/**
 * Created by quint on 2/05/2017.
 */

public class NoteRepository {

    public static List<Note> list(){
        List<Note> notes = SugarRecord.listAll(Note.class);
        return notes;
    }

    public static Note read(Long id){
        Note note = SugarRecord.findById(Note.class, id);
        return note;
    }

    public static void create(String title, String type, String description){
        Note note = new Note(title, type, description);
        SugarRecord.save(note);
    }

    public static void update(String title, String type, String description, Long id){
        Note note = SugarRecord.findById(Note.class, id);
        note.setTitle(title);
        note.setType(type);
        note.setDescription(description);
        SugarRecord.save(note);
    }

    public static void delete(Long id){
        Note user = SugarRecord.findById(Note.class, id);
        SugarRecord.delete(note);
    }

}

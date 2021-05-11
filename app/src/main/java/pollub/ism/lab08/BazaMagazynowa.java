package pollub.ism.lab08;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {PozycjaMagazynowa.class, WpisLog.class}, version = BazaMagazynowa.WERSJA, exportSchema = false)
public abstract class BazaMagazynowa extends RoomDatabase {

    public static final String NAZWA_BAZY = "Stoisko z warzywami";
    public static final int WERSJA = 2;

    public abstract PozycjaMagazynowaDAO pozycjaMagazynowaDAO();
    public abstract WpisLogDAO wpisLogDAO();
}

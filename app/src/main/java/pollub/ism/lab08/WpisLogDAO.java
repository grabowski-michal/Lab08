package pollub.ism.lab08;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface WpisLogDAO {

    @Insert
    public void insert(WpisLog pozycja);

    @Update
    void update(WpisLog pozycja);

    @Query("SELECT _id, date, old_quantity, new_quantity FROM WpisLog WHERE warzywo_name= :wybraneWarzywoNazwa")
    public WpisLog [] findLogsByName(String wybraneWarzywoNazwa);

    @Query("SELECT COUNT(*) FROM Warzywniak") //Ile jest rekordów w tabeli
    int size();
}

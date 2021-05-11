package pollub.ism.lab08;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "WpisLog")
public class WpisLog {
    @PrimaryKey(autoGenerate = true)
    public int _id;
    public String warzywo_name;
    public String date;
    public int old_quantity;
    public int new_quantity;
}

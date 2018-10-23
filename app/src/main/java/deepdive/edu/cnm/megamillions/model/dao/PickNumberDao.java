package deepdive.edu.cnm.megamillions.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import deepdive.edu.cnm.megamillions.model.entity.Pick;
import deepdive.edu.cnm.megamillions.model.entity.PickNumber;
import java.util.List;

@Dao
public interface PickNumberDao {

  @Insert(onConflict = OnConflictStrategy.FAIL)
  List<Long> insert(List<PickNumber> numbers);

  @Query("SELECT * FROM pick ORDER BY timestamp")
  List<Pick> select();

  @Delete
  int delete(Pick pick);


}

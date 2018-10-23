package deepdive.edu.cnm.megamillions.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;
import deepdive.edu.cnm.megamillions.model.entity.Pick;
import deepdive.edu.cnm.megamillions.model.pojo.PickAndNumbers;
import java.util.List;

@Dao
public interface PickDao {

  @Insert(onConflict = OnConflictStrategy.FAIL)
  long insert(Pick pick);

  @Query("SELECT * FROM Pick ORDER BY timestamp")
  List<Pick> select();

  @Transaction
  @Query("SELECT * FROM Pick ORDER BY timestamp")
  List<PickAndNumbers> selectWithNumbers();

  @Delete
  int delete(Pick pick);

}

package deepdive.edu.cnm.megamillions.model.pojo;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;
import deepdive.edu.cnm.megamillions.model.entity.Pick;
import deepdive.edu.cnm.megamillions.model.entity.PickNumber;
import java.util.List;

public class PickAndNumbers {

  @Embedded
  private Pick pick;

  @Relation(parentColumn = "pick_id", entityColumn = "pick_id")
  private List<PickNumber> numbers;

  public Pick getPick() {
    return pick;
  }

  public void setPick(Pick pick) {
    this.pick = pick;
  }

  public List<PickNumber> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<PickNumber> numbers) {
    this.numbers = numbers;
  }
}

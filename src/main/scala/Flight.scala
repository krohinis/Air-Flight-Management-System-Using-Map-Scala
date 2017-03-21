import scala.beans.BeanProperty

/**
  * Created by synerzip on 23/2/17.
  */
class Flight(@BeanProperty val flightNum: String,
             @BeanProperty val departLoc: String,
             @BeanProperty val arrivalLoc: String,
             @BeanProperty val Date: String,
             @BeanProperty val fare: Int,
             @BeanProperty val duration: Float) {
}


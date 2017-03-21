import scala.collection.mutable
import scala.io.Source

/**
  * Created by synerzip on 23/2/17.
  */

class FlightController {
  private val flightMap = new mutable.TreeMap[Integer, Flight]

  def searchFlight(fileName: String, deptLoc: String, arrivalLoc: String, date: String, choiceCode: Int): Unit = {
    for (line <- Source.fromFile(fileName).getLines()) {
      if (!line.isEmpty) {
        val a: Array[String] = line.split("\\|")
        if (a(1) == deptLoc && a(2) == arrivalLoc && a(3) == date) {
          val model: Flight = new Flight(a(0), a(1), a(2), a(3), a(4).toInt, a(5).toFloat)
          if (choiceCode == 1) {
            flightMap.put(a(4).toInt, model)
          }
          else if (choiceCode == 2) {
            flightMap.put(a(5).toFloat.toInt, model)
          }
        }
      }
    }
  }

  def updateView(): Unit = {
    val view = new View
    view.displayFlight(flightMap)
  }
}



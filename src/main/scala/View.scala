import scala.collection.mutable

/**
  * Created by synerzip on 23/2/17.
  */
class View {
  def displayFlight(flightMap: mutable.TreeMap[Integer, Flight]): Unit = {
    println("\nFLIGHT_NO|DEP_LOC|ARR_LOC|VALID_TILL     |FARE   |FLIGHT_DURN    ")

    flightMap.foreach(f => {
      val flight: Flight = f._2
      println(flight.getFlightNum + "\t | " + flight.getDepartLoc + "\t | " + flight.getArrivalLoc + "\t | " + flight.getDate + "\t | " + flight.getFare + "\t | " + flight.getDuration)
    })
  }
}



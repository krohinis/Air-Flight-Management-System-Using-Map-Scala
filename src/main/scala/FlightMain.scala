import java.io.File

/**
  * Created by synerzip on 23/2/17.
  */
object FlightMain {
  def main(args: Array[String]): Unit = {
    val controller = new FlightController
    print("Enter Departure Location : ")
    val departLoc = scala.io.StdIn.readLine().toUpperCase()
    print("Enter Arrival Location   : ")
    val arrivalLoc = scala.io.StdIn.readLine().toUpperCase()
    print("Enter Date : ")
    val departDate = scala.io.StdIn.readLine()
    print("Select Output Preference : 1.Fare  2.Duration \nEnter Code : ")
    val choice = scala.io.StdIn.readInt()

    val path: String = "/home/synerzip/AirFlightMngtScala/src/main/resources"
    val fileName: Array[File] = new java.io.File(path).listFiles
    fileName.foreach(x => {
      controller.searchFlight(x.toString, departLoc, arrivalLoc, departDate, choice)
    })
    controller.updateView()
  }
}

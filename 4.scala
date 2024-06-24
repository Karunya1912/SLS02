object demo {

  def calProfit(price: Double): Double = {

    var attendees =120+(15-price)/5*20
    var revenue = attendees * price
    var cost=500 + 3 * attendees
    val profit = revenue - cost
    profit
  }

  def main(args: Array[String]): Unit = {
    println(calProfit(5),calProfit(10),calProfit(15),calProfit(20),calProfit(25),calProfit(30),calProfit(35),calProfit(40))

  }
}

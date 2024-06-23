object demo {

  def calAttendance(price: Double): Int = {

    val basePrice = 15.0
    val baseAttendance = 120
    val attendanceChangeRate = 20
    val priceChangeRate = 5.0
    val priceDifference = (basePrice - price) / priceChangeRate
    val attendanceChange = priceDifference * attendanceChangeRate
    (baseAttendance + attendanceChange).toInt
  }

  def calProfit(price: Double): Double = {

    val attendance = calAttendance(price)
    val revenue = price * attendance
    val fixedCost = 500
    val variableCostPerAttendee = 3.0

    val totalCost = fixedCost + (variableCostPerAttendee * attendance)
    val profit = revenue - totalCost
    profit
  }

  def main(args: Array[String]): Unit = {

   val priceRange = BigDecimal(5.0) to BigDecimal(50.0) by BigDecimal(0.5)
   val profits = priceRange.map(price => (price.toDouble, calProfit(price.toDouble)))

    val (bestPrice, maxProfit) = profits.maxBy(_._2)

    println("The best ticket price is Rs."+ bestPrice + " which yields a maximum profit of Rs. "+maxProfit)

  }
}

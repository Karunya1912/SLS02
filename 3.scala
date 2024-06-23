object demo {

  def calSalary(normalhour: Int, OThour: Int):Int = {
    var normalhourSalary = normalhour * 250
    var OThourSalary = OThour * 85
    var grossSalary = normalhourSalary + OThourSalary
    grossSalary
  }

  def caltax(grossSalary: Double):Double = {
    var taxRate = 0.12
    var tax = grossSalary * taxRate
    tax

  }

  def main(args: Array[String]): Unit = {
    var normalhour = 40
    var OThour = 30
    var grossSalary = calSalary(normalhour: Int, OThour: Int)
    var tax = caltax(grossSalary)
    var takeHomeSalary = grossSalary - tax
    println("Gross Salary="+grossSalary)
    println("Tax ="+tax)
    println("Take Home Salary="+takeHomeSalary)
  }
}

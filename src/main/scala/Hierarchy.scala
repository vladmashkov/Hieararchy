trait Robot {
  val programmedText = "I'm robot!"
  def Say: Unit = println(Phrase)
  def Phrase: String = {
    programmedText
  }
  val ReactionToPeople: String
  val weapons: String
}
trait RobotCleaner extends Robot {
  override def Phrase: String = {
    programmedText + " Stand back! I'm cleaning!"
  }
  override val ReactionToPeople = "HATRED!!!"
  override val weapons = "No"
}
trait RobotGuard extends Robot {
  override def Phrase: String = {
    programmedText + " I'm protect property!"
  }
  override val weapons = "No"
}
trait RobotPolice extends RobotGuard {
  override def Phrase: String = {
    programmedText + " Hands up! I defend the law!"
  }
  override val weapons = "Yes"
}
trait RobotMilitary extends RobotPolice {
  override def Phrase: String = {
    programmedText + " Follow orders or be killed! I defend the country!"
  }
}
trait Terminator extends RobotCleaner with RobotMilitary {
  override val programmedText = "I'M A TERMINATOR!!!"
  override def Phrase: String = {
    programmedText + " YOU ARE TERMINATED!!!"
  }
}
object Main extends App {
val object1 = new Terminator {}
  object1.Say
}
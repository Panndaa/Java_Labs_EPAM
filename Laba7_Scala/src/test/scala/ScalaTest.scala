import Solution.Main
import org.scalatest._

class ScalaTest extends FlatSpec with Matchers {

  it should "Change number on text" in {
    val string = "1 2 3 0"
    Main.change(string) should be("One Two Many Zero")
  }

  it should "Test one for second task" in {
    Main.twitchMethod(new Main.Feather) should be("Feather is dousing.")
  }
}
package Solution

object Main {

  def change (string: String):String = {
    string.flatMap { case '0' => "Zero"  case '1' => "One" case '2' => "Two" case '3' => "Many" case c => s"$c" }
  }

  class Feather()extends AnyRef{
    def douse():String = "Feather is dousing."
  }

  class Pen()extends AnyRef{
    def removeCap():String = "Removing the pen's cap."
  }

  class Pencil()extends AnyRef{
    def Sharpen():String = "Pencil is sharpening."
  }

  def twitchMethod(value:AnyRef): String = {
    value match {
      case obj: Feather => obj.douse()
      case obj: Pen => obj.removeCap()
      case obj: Pencil => obj.Sharpen()
      case _ => "Unknown object."
    }
  }
}
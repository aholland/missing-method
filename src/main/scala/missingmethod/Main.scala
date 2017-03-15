package missingmethod
import scala.scalajs.js.annotation.JSExport
@JSExport
object Main {
 @JSExport
 final def main(): Unit = {
  List.empty[A].foreach(a => {
   case class Case(abc: a.b.C)
   Case(new a.b.C)
  })
 }
}
class A(val b: B)
class B {
 class C
}

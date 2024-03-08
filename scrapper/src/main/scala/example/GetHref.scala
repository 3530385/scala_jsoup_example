package example

import org.jsoup._
import scala.jdk.CollectionConverters._

object GetHref extends App {
  val doc = Jsoup.connect("http://en.wikipedia.org/").get()
  val brianHref = doc.select("a[title=Brian Mulroney]").attr("href")
  println(brianHref)
}

//(12) 「なう」という文字列で終わるツイートを抽出せよ．
import scala.io.Source
val r = Source.fromFile(args(0)).getLines.toList.filter(_.endsWith("なう"))
r.foreach(println(_))

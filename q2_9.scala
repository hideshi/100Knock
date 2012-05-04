//(19) 郵便番号・県名・市町村名の３要素を組で（まとめて）抽出せよ．
import scala.io.Source
val lines = Source.fromFile(args(0), "Shift-JIS").getLines.toList
val row = lines.map(_.split(","))
val tl = (for(a <- row) yield (a(2), a(6), a(7), a(8)))
					.map(t => if(t._4.contains("以下に掲載がない場合")) (t._1, t._2, t._3, "") else t)
tl.foreach(println(_))

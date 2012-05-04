//(27) (10)のプログラムを再利用し，頻度の高い英単語トップ100（単語と頻度がソートされたもの）を作成せよ．
import scala.io.Source
val lines = Source.fromFile(args(0)).getLines.toList
import scala.collection.mutable.Map
val m = Map[String, Int]()
lines.map(_.replaceAll("[,.!?]", "").toLowerCase).foreach(s => m.put(s, (m.getOrElse(s, 0) + 1)))
m.toList.sortWith((a, b) => a._2.compareTo(b._2) > 0).foreach(println(_))

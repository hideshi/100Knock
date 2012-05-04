//(10) 各行の２コラム目の文字列の出現頻度を求め，出現頻度の高い順に並べよ．
//ただし，(4)で作成したプログラムの出力を読み込むプログラムとして実装せよ．
//確認にはcut, uniq, sortコマンドを用いよ．
import scala.io.Source
val r = Source.fromFile(args(0)).getLines.toList
import scala.collection.mutable.Map
val m = Map[String, Int]()
r.foreach(s => m.put(s, (m.getOrElse(s, 0) + 1)))
m.toList.sortWith((a, b) => a._2.compareTo(b._2) > 0).foreach(println(_))

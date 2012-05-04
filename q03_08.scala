//(28) 各単語から文字バイグラムを抽出するプログラムを実装せよ．また，(27)と同様の方法で，頻度の高い文字バイグラムトップ100（バイグラムと頻度がソートされたもの）を作成せよ．
import scala.io.Source
val lines = Source.fromFile(args(0)).getLines.toList
val bigram = lines.map(_.sliding(2).toList).flatMap(_.toList)
import scala.collection.mutable.Map
val map = Map.empty[String, Int]
bigram.foreach(b => map.put(b, map.getOrElse(b, 0) + 1))
map.toList.sortWith((a, b) => a._2.compareTo(b._2) > 0).foreach(println(_))

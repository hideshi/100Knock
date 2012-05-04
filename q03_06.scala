//(26) -nessと-lyの両方の派生語尾をとる単語をすべて抜き出せ．
import scala.io.Source
val lines = Source.fromFile(args(0)).getLines.toList
import scala.collection.mutable.Set
val nessSet = Set.empty[String]
val lySet = Set.empty[String]
lines.foreach({t =>
		if(t.contains("ness")) nessSet add t.toLowerCase.stripSuffix("ness")
		if(t.contains("ly")) lySet add t.toLowerCase.stripSuffix("ly")
	})
(nessSet & lySet).toList.foreach(println(_))

//(13) 非公式RTのツイートの中で，RT先へのコメント部分のみを抽出せよ．
import scala.io.Source
val r = Source.fromFile(args(0)).getLines.toList
        .filter(_.contains("RT "))
        .map(_.replaceAll("RT .*", ""))
				.filter(_ != "")
r.foreach(println(_))

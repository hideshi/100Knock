//(24) (23)のプログラムを修正し，各トークンの末尾が記号で終わる場合は，その記号を別のトークンとして分離せよ．
import scala.io.Source
val lines = Source.fromFile(args(0)).getLines.toList
val row = lines.map(_.split(" "))
import java.io.PrintWriter
val out = new PrintWriter(args(0).stripSuffix(".sent") + ".tok")
row.foreach(_.foreach(t =>
			if(t.contains(".")) out.println(t + "\n")
			else out.println(t)
		))

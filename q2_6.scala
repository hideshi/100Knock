//(16) 括弧表現のうち，括弧の内側がアルファベット大文字の文字列，括弧の左側が漢字の文字列のものを抽出せよ．このとき，括弧の左側の表現と括弧の内側の表現をタブ区切り形式で出力せよ．
import scala.io.Source
val lines = Source.fromFile(args(0)).getLines.toList
val regex = """(.+)\(([A-Z]+)\)""".r
val matches = for(line <- lines;
							m <- regex.findFirstMatchIn(line)
						) yield (m.group(1), m.group(2))
val res = matches.filter(p => checkKanji(p._1))
res.foreach(p => println(p._1 + "\t" + p._2))

def checkKanji(s:String):Boolean = {
	val chars = for(
			c <- s
			if c >= 0x4E00 && c <= 0x9FFF
	) yield c
	s.length == chars.length
}

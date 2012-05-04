//(14) ツイッターのユーザー名（@で始まる文字列）を抽出せよ．
import scala.io.Source
val list = Source.fromFile(args(0)).getLines.toList
val regex = """@[^\s]+""".r
val users =
for(row <- list;
		user <- regex.findAllIn(row)
) yield user.stripSuffix(":")
users.toSet.toList.foreach((s:String) => println(s))

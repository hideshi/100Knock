//(15) ツイッターのユーザー名を，そのユーザーのページへのリンク（で囲まれたHTML断片）に置換せよ．
import scala.io.Source
val list = Source.fromFile(args(0)).getLines.toList
val regex = """@[^\s]+""".r
val users =
for(row <- list;
		user <- regex.findAllIn(row)
) yield user.stripSuffix(":")
val url = "https://twitter.com/#!/"
val html = users.toSet.toList.map((u:String) => "<a href=\"" + url + u.stripPrefix("@") + "\">" + u + "</a>")
html.foreach(println(_))

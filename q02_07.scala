//(17) 人名らしき表現にマッチする正規表現を各自で設計し，抽出せよ．
//（例えば「さん」「氏」「ちゃん」などの接尾辞に着目するとよい）
import scala.io.Source
val lines = Source.fromFile(args(0)).getLines.toList
val suffix = "(さん|ちゃん|くん|様|君)"
val regex = ("""([A-Za-z0-9 ]+|[ぁ-んー]+|[ァ-ヶー]+|[一-龠]+)""" + suffix).r
val names = for(
			line <- lines;
			name <- regex.findAllIn(line)
		) yield name.replaceAll(suffix, "")
names.toSet.toList.foreach((s:String) => println(s))

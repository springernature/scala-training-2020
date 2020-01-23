import java.io.File

import org.apache.commons.io.input.XmlStreamReader
import org.apache.commons.lang3.math.Fraction

class Operations (parserService : StringParsingService) {

  def add(a:Int, b:Int):Int = a+b

  def add(a: String, b: String) = parserService.parseMyNumber(a)+parserService.parseMyNumber(b)

  def mul(a: String, b: String) = {parserService.parseMyNumber(a)*parserService.parseMyNumber(b)
    println("success")}


  def mul(a:Int, b:Int):Int = a*b

  def addFraction(num:Int, den:Int): Fraction = {
    Fraction.getFraction(num, den)
  }

  def readXML(file:File): XmlStreamReader = {
    new XmlStreamReader(file)
  }

  def addSuperComp(a:Int, b:Int, compService : ComputationService):Int = compService.getAddedFromSuperComp(a, b)

}

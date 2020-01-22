import java.io.File

import org.apache.commons.io.input.XmlStreamReader
import org.apache.commons.lang3.math.Fraction

class Operations {

  def add(a:Int, b:Int):Int = a+b
  def mul(a:Int, b:Int):Int = a*b

  def addFraction(num:Int, den:Int): Fraction = {
    Fraction.getFraction(num, den)
  }

  def readXML(file:File): XmlStreamReader = {
    new XmlStreamReader(file)
  }

}

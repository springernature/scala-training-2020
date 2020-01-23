class ComputationService {

  def getAddedFromSuperComp(a: Int, b :Int): Int = {
    //Some services to connect to some 3rd service
    a+b
  }

  def getMutipliedFromSuperComp(a : Int, b: Int): Int = {
    //Some DB calls etc
    a*b
  }

}

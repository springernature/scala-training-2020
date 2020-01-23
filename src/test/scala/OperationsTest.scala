import org.apache.commons.lang3.math.Fraction
import org.scalatest.{FunSpec, Matchers}
import org.scalatestplus.mockito.MockitoSugar
import org.mockito.Mockito._

class OperationsTest extends FunSpec with Matchers with MockitoSugar  {//AnyFunSpec with Matchers  {

  val operations = new Operations(new StringParsingService)

  describe("Operations") {

    val expectedResult: Fraction = Fraction.getFraction(10, 10)

    it("should add two given numbers") {

      operations.add(10, 20) should be (30)

    }

    it("should add two given -ve numbers") {

      operations.add(-10, -20) should be (-30)

    }

    it("should add two given +ve and -ve numbers") {

      operations.add(-10, 20) should be (10)

    }

    it("should mutiply two given number"){

      operations.mul(10, 20) should be (200)

    }

    it("should mutiply two given +ve and -ve number"){

      operations.mul(10, -20) should be (-200)
      operations.mul(-10, 20) should be (-200)


    }


    it("should mutiply two zeros"){

      operations.mul(0, 0) should be (0)

    }

    it("should mutiply 1,0 and 0 and 1"){

      operations.mul(1, 0) should be (0)
      operations.mul(0, 1) should be (0)

    }

    it("should add fraction ") {
      operations.addFraction(10, 10) should be (expectedResult)
    }

  }

  describe("Add super comp") {
    //we have
    val mockCompService = mock[ComputationService]
    when(mockCompService.getAddedFromSuperComp(100, 200)).thenReturn(300)

    it("should add by calling super comp service"){
      operations.addSuperComp(100,200, mockCompService) should be (300)
      verify(mockCompService,times(1)).getAddedFromSuperComp(100, 200)
    }
  }

}

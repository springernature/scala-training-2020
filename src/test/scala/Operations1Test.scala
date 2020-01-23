import org.scalatest.{FunSpec, Matchers}
import org.scalatestplus.mockito.MockitoSugar
import org.mockito.Mockito._

class Operations1Test extends FunSpec with Matchers with MockitoSugar{

  describe("Operations") {

    val mockParsingService = mock[StringParsingService]
    when(mockParsingService.parseMyNumber("10")).thenReturn(10)
    when(mockParsingService.parseMyNumber("20")).thenReturn(20)
    when(mockParsingService.parseMyNumber("30")).thenReturn(30)
    when(mockParsingService.parseMyNumber("40")).thenReturn(40)

    val operation = new Operations(mockParsingService)
    val expectedAddition = 30

    it("should add number"){
      operation.add(10, 20) should be(30)
    }

    it("should add +ve and -ve number"){
      operation.add(10, -30) should be(-20)
    }

    it("should add string numbers"){
      operation.add("10", "20") should be(30)
    }

    it("should add another string numbers"){
      operation.add("30", "40") should be(70)
    }

    it("should mutiply string numbers"){
      operation.mul("30", "40")
      verify(mockParsingService, times(2)).parseMyNumber("30")
      verify(mockParsingService, times(2)).parseMyNumber("40")
    }
  }

}

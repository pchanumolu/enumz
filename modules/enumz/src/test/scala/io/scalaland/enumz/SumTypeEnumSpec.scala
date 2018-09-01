package io.scalaland.enumz

import org.specs2.mutable.Specification

class SumTypeEnumSpec extends Specification {

  "Enum" should {

    "derive instance for scala.Enumeration enum" in {
      val enum = Enum[TestSumType]

      enum.values must_== Vector(TestSumType.A, TestSumType.B, TestSumType.C)
      enum.values.map(enum.getName) must_== Vector("A", "B", "C")
      enum.values.map(enum.getIndex) must_== Vector(0, 1, 2)
    }
  }
}

package com.sksamuel.kotest.example.allure

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.doubles.shouldBeExactly
import kotlin.math.pow
import io.kotest.datatest.withData
import io.qameta.allure.Allure

class CubeTest : DescribeSpec({
   describe("when cubing a number") {
      it("should be the cube value") {
         2.0.pow(3.0) shouldBeExactly 8.0
         (-4.0).pow(3.0) shouldBeExactly -64.0
         9.0.pow(3.0) shouldBeExactly 729.0
      }
   }
   describe("forAll does not count rows as tests") {
      forAll(
         row(2.0, 8.0),
         row(-4.0, -64.0),
         row(9.0, 729.0)
      ) { input, expected ->
         input.pow(3.0) shouldBeExactly expected
      }
   }
   describe("allure picks up on the tests") {
      val testCases = listOf(
         Pair(2.0, 8.0),
         Pair(-4.0, -64.0),
         Pair(9.0, 729.0)
      )

      withData(testCases) { data ->
         val input = data.first
         val expected = data.second
         input.pow(3.0) shouldBeExactly expected
      }
   }
})

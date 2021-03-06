package com.github.yoskhdia.sqscala

import org.specs2.mutable.Specification

import scala.util.Try

class SqsClient$Test extends Specification {

  "SqsClient$Test" should {
    System.setProperty("aws.accessKeyId", "dummy")
    System.setProperty("aws.secretKey", "dummy")

    "apply by default credential chains" in {
      val clientTry = Try(SqsClient())
      clientTry must beSuccessfulTry
      Try(clientTry.get.shutdown()) must beSuccessfulTry
    }
  }
}

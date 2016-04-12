/*
 * Copyright (C) 2009-2016 Lightbend Inc. <https://www.lightbend.com>
 */
package play.api.libs.json

object JsLookupSpec extends org.specs2.mutable.Specification {

  title("JSON Lookup")

  "JsLookupResult" should {
    "implement asOpt for successful lookups" in {
      (Json.obj("foo" -> "bar") \ "foo").asOpt[String] must beSome("bar")
    }

    "implement asOpt for unsuccessful lookups returning None" in {
      (Json.obj("foo" -> "bar") \ "baz").asOpt[String] must beNone
    }
  }
}

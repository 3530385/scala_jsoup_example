package example

class HelloSpec extends munit.FunSuite {
  test("find Brian") {
    assertEquals(example.GetHref.brianHref, "/wiki/Brian_Mulroney")
  }
}

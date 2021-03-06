describe("pow", function() {

  describe("raises x to power n", () => {

    function makeTest(x) {
      let expected = x * x * x;
      it(`${x} in the power 3 is ${expected}`, () => {
        assert.equal(pow(x, 3), expected);
      });
    }

    for (let x = 1; x <= 5; x++) {
      makeTest(x);
    }

  });

  it("if n is negative, the result is NaN", () => {
    assert.isNaN(pow(2, -1));
  });

  it("if n is not integer, the result is NaN", () => {
    assert.isNaN(pow(2, 1.5));
  });

});


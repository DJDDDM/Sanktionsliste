using ConsoleApp1;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;

namespace HelloWorldTests
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void BasicRooterTest()
        {
            Rooter totest = new Rooter();
            double expected = 2.0;
            double input = MyMath.Square(expected);
            double actual = totest.SquareRoot(input);
            Assert.AreEqual(expected, actual, delta: expected / 100);
        }

        [TestMethod]
        public void TryValueRange()
        {
            for (double expected = 1e-8; expected < 1e+8; expected *= 39.2)
            {
                TestSquareOf(expected);
            }
        }

        private void TestSquareOf(double expected)
        {
            Rooter rooter = new Rooter();
            double actualResult = rooter.SquareRoot(expected * expected);
            Assert.AreEqual(expected, actualResult, expected / 1000);
        }

        [TestMethod]
        public void TestSquare()
        {
            Assert.AreEqual(9, MyMath.Square(3));
        }
    }

    [TestClass]
    public class test_stringmatcher
    {
        Stringmatcher matcher;
        [TestInitialize]
        public void testInit()
        {
            matcher = new Stringmatcher();
        }
        [TestMethod]
        public void Test_secondstringisempty()
        {
            Assert.IsFalse(matcher.match("Name", ""));
        }
        [TestMethod]
        public void Test_firststringisempty()
        {
            Assert.IsFalse(matcher.match("", "Name"));
        }
        [TestMethod]
        public void Test_bothstringsareempty()
        {
            Assert.IsFalse(matcher.match("", ""));
        }

        [TestMethod]
        public void Test_unequalstrings()
        {
            Assert.IsFalse(matcher.match("Name", "Wolf"));
        }

        [TestMethod]
        public void Test_equalstrings()
        {
            Assert.IsTrue(matcher.match("Name", "Name"));
        }
    }
}
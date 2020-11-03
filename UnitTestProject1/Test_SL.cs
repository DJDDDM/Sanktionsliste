using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;

namespace Businessobjects
{
    [TestClass]
    public class Test_SL {
        [TestMethod]
        public void Bad_Name_Should_be_on_SL()
        {
            Sanktionsliste SL = new Sanktionsliste();
            Assert.IsTrue(SL.is_on("Böser Name"));
        }
        [TestMethod]
        public void Good_Name_Should_not_be_on_SL()
        {
            Sanktionsliste SL = new Sanktionsliste();
            Assert.IsFalse(SL.is_on("Guter Name"));
        }

        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void epty_name_should_throw_exception()
        {
            Sanktionsliste SL = new Sanktionsliste();
            SL.is_on("");
        }
            
    }
}
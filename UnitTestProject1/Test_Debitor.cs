using Microsoft.VisualStudio.TestTools.UnitTesting;
using Businessobjects;
using System;

namespace Businessobjects
{
    [TestClass]
    public class Test_Debitor
    {
        [TestMethod]
        public void Bad_Debitor_Should_return_true()
        {
            Debitor bad_Debitor = new Debitor("Böser Name");
            Assert.IsTrue(bad_Debitor.is_hit());
        }

        [TestMethod]
        public void Good_Debitor_Should_return_true()
        {
            Debitor good_debitor = new Debitor("Guter Name");
            Assert.IsFalse(good_debitor.is_hit());
        }
        
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void empty_debitor_should_throw_exception()
        {
            Debitor bad_Debitor = new Debitor("");
            bad_Debitor.is_hit();
        }
 
    }
}
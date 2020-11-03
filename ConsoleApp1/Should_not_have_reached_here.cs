using System;
using System.Runtime.Serialization;

namespace Businessobjects
{
    [Serializable]
    internal class Should_not_have_reached_here : Exception
    {
        public Should_not_have_reached_here()
        {
        }

        public Should_not_have_reached_here(string message) : base(message)
        {
        }

        public Should_not_have_reached_here(string message, Exception innerException) : base(message, innerException)
        {
        }

        protected Should_not_have_reached_here(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }
    }
}
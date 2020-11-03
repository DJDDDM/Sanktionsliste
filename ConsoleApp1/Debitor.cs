using System;

namespace Businessobjects
{
        public class Debitor
             {
        private readonly string name;
        private Sanktionsliste SL;

        public Debitor(string name)
        {
            this.name = name;
            this.SL = new Sanktionsliste();
        }

        public bool is_hit()
        {
            return SL.is_on(name);
        }
    }
}
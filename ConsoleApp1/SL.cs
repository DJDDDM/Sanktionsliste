using System;
using System.Collections;

namespace Businessobjects
{
    public class Sanktionsliste
    {
        private ArrayList Names;
        public Sanktionsliste()
        {
            Names = new ArrayList();
            Names.Add("Böser Name");
        }

        public bool is_on(string name)
        {
            null_check(name);
            return Names.Contains(name);
        }

        private static void null_check(string name)
        {
            if (string.IsNullOrEmpty(name))
            {
                throw new ArgumentException(" darf nicht NULL oder leer sein.", nameof(name));
            }
        }
    }
}
using System;

namespace HelloWorldTests
{
    public class Stringmatcher
    {
        internal bool match(string name1, string name2)
        {
            if (is_empty(name1) & is_empty(name2)) return false;
            if (name2 == name1) return true;
            return false;
        }

        private bool is_empty(string name)
        {
            return name == "";
        }
    }
}
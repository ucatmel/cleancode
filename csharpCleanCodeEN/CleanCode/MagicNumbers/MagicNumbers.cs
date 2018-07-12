
namespace CleanCode.MagicNumbers
{
    public class MagicNumbers
    {
        private const int draft = 1;

        public void ApproveDocument(int status)
        {
            if (status == draft)
            {
                // ...
            }
            else if (status == 2)
            {
                // ...
            }
        }

        public void RejectDoument(string status)
        {
            switch (status)
            {
                case "1":
                    // ...
                    break;
                case "2":
                    // ...
                    break;
            }
        }
    }
}

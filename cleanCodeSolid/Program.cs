using System;
using RestSharp;

namespace cleanCodeSolid
{
    class Program
    {
        static void Main(string[] args)
        {
            var client = new RestClient();
            client.BaseUrl = new Uri("http://api.openweathermap.org");

            var request = new RestRequest();
            request.Resource = "data/2.5/weather?q=Wuppertal&appid=8124eedeb9bba16c11f17307ad080d6a";

            IRestResponse response = client.Execute(request);
            Console.WriteLine("Hello World!");
            Console.WriteLine(response.Content);
            
            Console.ReadKey();

        }
    }
}

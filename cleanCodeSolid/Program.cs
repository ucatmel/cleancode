using System;
using RestSharp;
using Newtonsoft.Json.Converters;

namespace cleanCodeSolid
{
    class Program
    {
        static void Main(string[] args)
        {
            string stadt = "";
            var client = new RestClient();
            client.BaseUrl = new Uri("http://api.openweathermap.org");

            var request = new RestRequest();
            var weatherQuery = "data/2.5/weather?q=";
            var appID = "&appid=8124eedeb9bba16c11f17307ad080d6a";
            var lang = "&lang=de";
            

            
            Console.WriteLine("Von welcher Stadt soll das Wetter angezeigt werden:");
            stadt = Console.ReadLine();
            request.Resource = $"{weatherQuery}{stadt}{appID}{lang}";

            IRestResponse response = client.Execute(request);
            var rootweather = Newtonsoft.Json.JsonConvert.DeserializeObject<RootObject>(response.Content);

            Console.WriteLine($"Das Wetter in {stadt} ist {rootweather.weather[0].description}" );
            Console.WriteLine(response.Content);
            Console.ReadKey();

        }
    }
}

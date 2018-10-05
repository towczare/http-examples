# Geocoding and Weather API

## Materials

Here is couple of services:
1. https://www.random.org/ - allows to generate random numbers or alphanumerical text.
2. http://www.datasciencetoolkit.org/maps/api/geocode/json?address=łódź - free geocoder api
3. https://darksky.net/dev/account - free weather api, you need to create free account. 
You can use https://temp-mail.org/ to avoid spam on your personal account

List of cities

|ID|City|Country|
|-|----|----|
|1|Tokyo|Japan|
|2|Mumbai (Bombay)|India|
|3|Delhi|India|
|4|Dhaka|Bangladesh|
|5|Mexico City|Mexico|
|6|São Paulo|Brazil|
|7|Lagos|Nigeria|
|8|Jakarta|Indonesia|
|9|New York|USA|
|10|Karachi|Pakistan|
|11|Calcutta|India|
|12|Buenos Aires|Argentina|
|13|Cairo|Egypt|
|14|Metro Manila|Philippines|
|15|Los Angeles|USA|
|16|Rio de Janeiro|Brazil|
|17|Istanbul|Turkey|
|18|Shanghai|China|
|19|Moscow|Russia|
|20|Osaka, Kobe|Japan|
|21|Beijing|China|
|22|Lima|Peru|
|23|Paris|France|
|24|Tianjin|China|
|25|Lahore|Pakistan|
|26|Bogotá|Colombia|
|27|Kinshasa|Congo|
|28|Bangalore|India|
|29|Chicago|USA|
|30|Wuhan|China|
|31|Seoul|South Korea|
|32|Chennai (Madras)|India|
|33|Tehran|Iran|
|34|Riyadh|Saudi Arabia|
|35|Hyderabad|India|
|36|Baghdad|Iraq|
|37|Hong Kong|China|
|38|Chittagong|Bangladesh|
|39|Ahmadabad|India|
|40|Bangkok|Thailand|
|41|Surat|India|
|42|London|UK|
|43|Pune (Poona)|India|
|44|Belo Horizonte|Brazil|
|45|Ho Chi Minh City|Vietnam|
|46|Santiago|Chile|
|47|Dortmund, Bochum|Germany|
|48|Miami|USA|
|49|Kabul|Afghanistan|
|50|Khartoum|Sudan|
|51|Atlanta|USA|
|52|Toronto|Canada|
|53|Chongqing|China|
|54|Bandung|Indonesia|
|55|Jidda|Saudi Arabia|
|56|Philadelphia|USA|
|57|Yangon|Myanmar|
|58|Dallas, Fort Worth|USA|
|59|Beihai|China|
|60|Hanoi|Vietnam|
|61|Houston|USA|
|62|Madrid|Spain|
|63|St Petersburg|Russia|
|64|Shenyang|China|
|65|Brasília|Brazil|
|66|Singapore|Singapore|
|67|Sydney|Australia|
|68|Dar es Salaam|Tanzania|
|69|Abidjan|Côte d'Ivoire|
|70|Casablanca|Morocco|
|71|Boston|USA|
|72|Luanda|Angola|
|73|Nairobi|Kenya|
|74|Algiers|Algeria|
|75|Washington DC|USA|
|76|Ankara|Turkey|
|77|East Rand (Ekurhuleni)|South Africa|
|78|Jaipur|India|
|79|Alexandria|Egypt|
|80|Addis Ababa|Ethiopia|
|81|Phoenix, Mesa|USA|
|82|Johannesburg|South Africa|
|83|Pôrto Alegre|Brazil|
|84|Guadalajara|Mexico|
|85|Barcelona|Spain|
|86|Kanpur|India|
|87|Fortaleza|Brazil|
|88|Salvador|Brazil|
|89|Medellín|Colombia|
|90|Recife|Brazil|
|91|Detroit|USA|
|92|Monterrey|Mexico|
|93|Melbourne|Australia|
|94|Chengdu|China|
|95|Faisalabad|Pakistan|
|96|Kano|Nigeria|
|97|Curitiba|Brazil|
|98|Guangzhou|China|
|99|Cape Town|South Africa|
|100|Lucknow|India|

## Exercise

1. Locate right endpoints from each of mentioned services.
2. Now using multiple calls, create following pipeline:
3. First draw 5 random numbers from random.org, which ten you are going to use as your cities from provided list.
4. For each city, perform one request using geocoder api to get their coordinates
5. Last step, you are going to do. Use following coordinates to get weather data for each particular city.
6. Use right parameters to modify request:
- use polish descriptions
- use si units
Here is documentation for service https://darksky.net/dev/docs#/dev/docs#response-format 
7. Write down following:
- current temperature
- current summary 
- current cloud cover
8. Repeat for all cities
9. Pick the city with best weather
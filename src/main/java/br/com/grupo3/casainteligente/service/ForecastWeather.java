package br.com.grupo3.casainteligente.service;

/**
 * TODO
 * Sensor que pega informações do openweather a partir da Localization recebida pelo serviço de localização da Residência do Serviço de API-Casa-Inteligente  
 *
 */
//import org.json.JSONException;
//import org.json.JSONObject;

public class ForecastWeather extends BaseWeather {

    private static final String TYPE_FORECAST = "forecast";

   /* @Override
    protected String parseJson(String json) throws JSONException {
        JSONObject jsonObject = new JSONObject(json);
        JSONObject jsonObjectCity = jsonObject.getJSONObject("city");
        String resultCountry = jsonObjectCity.getString("country");
        String resultName = jsonObjectCity.getString("name");
        JSONObject jsonObjectCoord = jsonObjectCity.getJSONObject("coord");
        Double resultLat = jsonObjectCoord.getDouble("lat");
        Double resultLon = jsonObjectCoord.getDouble("lon");

        //parse rest of result yourself...

        return "lon" + ":" + resultLon + " " + "lat" + ":" + resultLat + " " +
                "country" + ":" + resultCountry + " " + "name" + ":" + resultName;
    }


    @Override
    protected String getWeatherType() {
        return TYPE_FORECAST;
    }*/

}

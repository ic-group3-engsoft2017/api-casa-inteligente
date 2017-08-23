package br.com.grupo3.casainteligente.service;

//import org.json.JSONException;
import br.com.grupo3.casainteligente.service.ApiWeather;

public abstract class BaseWeather {

    private static final String ENDPOINT = "http://api.openweathermap.org/data/2.5/";
    private static final String APP_ID = "&APPID=4e09cb0c1caa7127ba28d8a48f3104a2";

    private ApiWeather apiWeather = new ApiWeather();

    /*protected abstract String getWeatherType();

    protected abstract String parseJson(String json) throws JSONException;

    public String getInfoById(String id) {
        String json = getJsonById(id);
        return parseJson(json);
    }

    public String getInfoByName(String name) {
        String json = getJsonByName(name);
        return parseJson(json);
    }


    private String getJsonById(String id) {
        String url = ENDPOINT + getWeatherType() + "?id=" + id + APP_ID;
        return apiWeather.getRawResponse(url);
    }

    private String getJsonByName(String name) {
        String url = ENDPOINT + getWeatherType() + "?q=" + name + APP_ID;
        return apiWeather.getRawResponse(url);
    }*/

}
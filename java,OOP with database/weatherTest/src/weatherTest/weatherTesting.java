package weatherTest;

import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.model.CurrentWeather;

public class weatherTesting{

    public static void main(String[] args)
            throws APIException {
        
        // declaring object of "OWM" class
        OWM owm = new OWM("5d95a7ace8b5caeb5b203f933ea0d4fd");

        // getting current weather data for the "Wroclaw" city
        CurrentWeather cwd = owm.currentWeatherByCityName("Wroclaw");
        
        // checking data retrieval was successful or not
        if (cwd.hasRespCode() && cwd.getRespCode() == 200) {
        
            // checking if city name is available
            if (cwd.hasCityName()) {
                //printing city name from the retrieved data
                System.out.println("City: " + cwd.getCityName());
            }
            
            // checking if max. temp. and min. temp. is available
            if (cwd.hasMainData() && cwd.getMainData().hasTempMax() && cwd.getMainData().hasTempMin()) {
                // printing the max./min. temperature
                System.out.println("Temperature: " + cwd.getMainData().getTempMax()
                            + "/" + cwd.getMainData().getTempMin() + "\'K");
            }
        }
    }
}

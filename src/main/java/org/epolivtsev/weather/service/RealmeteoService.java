package org.epolivtsev.weather.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class RealmeteoService {

    public String getTemperatureByCity(String city) {
        try {
            Document doc = Jsoup.connect("https://realmeteo.ru/" + city + "/1/current").get();
            Elements tds = doc.select("table#realdata_mobile td.meteodata#col1");
            if (tds.isEmpty())
                return "Город не найден - " + city;
            else
                return tds.get(0).text();
        } catch (Exception e) {
            return "Ошибка получения погоды для города - " + city;
        }

    }
}

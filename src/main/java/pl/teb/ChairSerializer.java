package pl.teb;

import com.google.gson.Gson;

public class ChairSerializer {
    public void krzesla(Chair bestChair) {
        Gson gson = new Gson();
        String json = gson.toJson(bestChair);
        System.out.println(json);
    }

    public Chair unkrzeslo(String mojeSterialozowaneKrzeslo){
        Gson engine= new Gson();
        Chair najwygodniejszeKrzesloNaSwiecie= engine.fromJson(mojeSterialozowaneKrzeslo,Chair.class);

        return najwygodniejszeKrzesloNaSwiecie;

    }
}

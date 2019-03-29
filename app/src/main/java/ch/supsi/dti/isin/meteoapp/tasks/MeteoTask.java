package ch.supsi.dti.isin.meteoapp.tasks;

import android.os.AsyncTask;

import java.util.List;

import ch.supsi.dti.isin.meteoapp.model.Location;
import ch.supsi.dti.isin.meteoapp.model.Weather;

public class MeteoTask extends AsyncTask<Void, Void, Location> {

    private String apiKey = "815504bb440299e3ebbb76868cbc7c47";
    private OnTaskCompleted listener;
    private Location location;

    public MeteoTask(OnTaskCompleted listener, Location location) {
        this.listener = listener;
        this.location = location;
    }

    @Override
    protected Location doInBackground(Void... voids) { // chiamo doInBackground() senza parametri
        Weather weatehr = new MeteoFetcher().fetchItems(apiKey, location.getName());
        location.setWeather(weatehr);
        return location;
    }
    @Override
    protected void onPostExecute(Location newLocation) {
        if(listener != null)
            listener.onTaskCompleted(newLocation); // alla fine del Task richiamo il metodo onTaskCompleted() del listener
    }
}
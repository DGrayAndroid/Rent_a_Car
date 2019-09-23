package dalton.gray.rentacar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CarRentals extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] rentalSites = {"Hipmunk", "Expedia", "RentalCars", "Enterprise", "Hertz", "Alamo"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_car_rentals, R.id.rentals, rentalSites));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                // Hipmink
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hipmunk.com/cars")));
                break;
            case 1:
                // Expedia
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.expedia.com/Cars")));
                break;
            case 2:
                // RentalCars
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rentalcars.com/")));
                break;
            case 3:
                // Enterprise
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.enterprise.com/en/home.html")));
                break;
            case 4:
                // Hertz
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hertz.com/rentacar/reservation/")));
                break;
            case 5:
                // Alamo
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alamo.com/en_US/car-rental/home.html")));
                break;
        }
    }
}

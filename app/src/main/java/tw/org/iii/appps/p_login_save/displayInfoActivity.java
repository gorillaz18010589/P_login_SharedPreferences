package tw.org.iii.appps.p_login_save;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class displayInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        SharedPreferences mPreferences = getSharedPreferences("ha",MODE_PRIVATE);
        String display = mPreferences.getString("display","");

        TextView txtMsg = findViewById(R.id.txt_user_msg);
        txtMsg.setText(display);
    }
}

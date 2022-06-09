package sg.edu.np.mad.p05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btn = findViewById(R.id.button);
        User user = new User("username", "desc", 1, false);
        follow_condition(user, btn);
        
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                // Perform action on click
                if (!user.followed)
                {
                    user.followed = true;
                }
                else
                {
                    user.followed = false;
                }
                follow_condition(user, btn);
            }
        });
    }

    public void follow_condition(User user, Button btn)
    {
        if (!user.followed)
        {
            btn.setText("FOLLOW");
        }
        else
        {
            btn.setText("UNFOLLOW");
        }
    }

    // Previously Before Changes
    /*public void follow(View view)
    {
        Button btn = findViewById(R.id.button);
        User user = new User("username", "desc", 1, false);
        follow_condition(user, btn);

        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                // Perform action on click
                if (!user.followed)
                {
                    user.followed = true;
                }
                else
                {
                    user.followed = false;
                }
                follow_condition(user, btn);
            }
        });
    }*/
}

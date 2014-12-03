package ui.activity;


import ui.pictureguess.activity.LPModelSelectActivity;
import ui.soundexplainguess.activity.CModeSelectActivity;
import ui.soundidentify.activity.SModeSelectActivity;
import edu.fjnu.guess.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	
	private Button main_model1;
	private Button main_model2;
	private Button main_model3;
	private Button main_ranklist;
	private Button main_gamehelp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		
		main_model1=(Button) findViewById(R.id.main_model1);
		main_model1.setOnClickListener(this);
		
		main_model2=(Button) findViewById(R.id.main_model2);
		main_model2.setOnClickListener(this);
		
		main_model3=(Button) findViewById(R.id.main_model3);
		main_model3.setOnClickListener(this);
		
		main_ranklist=(Button) findViewById(R.id.main_ranklist);
		main_ranklist.setOnClickListener(this);
		
		main_gamehelp=(Button) findViewById(R.id.main_gamehelp);
		main_gamehelp.setOnClickListener(this);
		
	}

	
	public void onClick(View v) {
		int id=v.getId();
		Intent intent = null;
		switch (id) {
		case R.id.main_model1:
			intent =new Intent(this,SModeSelectActivity.class);
			startActivity(intent);
			break;
		case R.id.main_model2:
			intent =new Intent(this,CModeSelectActivity.class);
			startActivity(intent);
			break;
		case R.id.main_model3:
			intent =new Intent(this,LPModelSelectActivity.class);
			startActivity(intent);
			break;
		case R.id.main_ranklist:
			intent =new Intent(this,RankListActivity.class);
			startActivity(intent);
			break;
		case R.id.main_gamehelp:
			intent =new Intent(this,GameHelpActivity.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}
	
	
	

}

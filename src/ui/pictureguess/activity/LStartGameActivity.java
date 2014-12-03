package ui.pictureguess.activity;

import ui.pictureguess.adapter.LookPictureAdapter;
import edu.fjnu.guess.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;

public class LStartGameActivity extends Activity implements OnClickListener{
	private GridView lookpicture_gridView1;
	private LookPictureAdapter mAdapter ;
	private ImageButton lookpicture_helpbutton;
	private ImageButton lookpicture_sharebutton;
	private Button lookpicture_return;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lookpicture);
		lookpicture_gridView1=(GridView) findViewById(R.id.lookpicture_gridView1);
		mAdapter = new LookPictureAdapter(this);
		lookpicture_gridView1.setAdapter(mAdapter);
		
		lookpicture_helpbutton=(ImageButton) findViewById(R.id.lookpicture_helpbutton);
		lookpicture_helpbutton.setOnClickListener(this);
		
		lookpicture_sharebutton=(ImageButton) findViewById(R.id.lookpicture_sharebutton);
		lookpicture_sharebutton.setOnClickListener(this);
		
		lookpicture_return=(Button) findViewById(R.id.lookpicture_return);
		lookpicture_return.setOnClickListener(this);
		
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		mAdapter.notifyDataSetChanged();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id=v.getId();
		Intent intent = null;
		switch (id) {
		case R.id.lookpicture_return:
			intent =new Intent(this,LPModelSelectActivity.class);
			startActivity(intent);
			break;
		case R.id.lookpicture_helpbutton:
			AlertDialog.Builder dialog = new AlertDialog.Builder(LStartGameActivity.this);
			dialog.setMessage("你确定要花100金币来获取一个答案提示吗？");
			dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			});
			dialog.setNegativeButton("取消",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			} );
			dialog.show();
			break;
		case R.id.lookpicture_sharebutton:
			
			intent=new Intent(Intent.ACTION_SEND);   
            intent.setType("image/*");   
            intent.putExtra(Intent.EXTRA_SUBJECT, "Share");   
            intent.putExtra(Intent.EXTRA_TEXT, "I have successfully share my message through my app (分享自city丽人馆)");   
            
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);   
            startActivity(Intent.createChooser(intent, getTitle()));   			
	        break;
		default:
			break;
		}
	}
}

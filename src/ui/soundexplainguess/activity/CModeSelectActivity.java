package ui.soundexplainguess.activity;

import ui.soundexplainguess.adapter.CModelSelectAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import edu.fjnu.guess.R;


/**
 * 听音乐猜成语关卡选择类：实现了听音乐猜成语游戏模式的关卡选择
 * @author 唐文明	2014-11-19
 * 
 * */
public class CModeSelectActivity extends Activity {
	private GridView gv_modelselect;
	private CModelSelectAdapter mAdapter ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.modeselect);

		gv_modelselect=(GridView) findViewById(R.id.desgin_gridView1);

		mAdapter = new CModelSelectAdapter(this);
		gv_modelselect.setAdapter(mAdapter);

		gv_modelselect.setOnItemClickListener(new MyOnItemClickListener());
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		mAdapter.notifyDataSetChanged();
	}

	private final class MyOnItemClickListener implements OnItemClickListener{

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			Intent intent = null;
			switch (arg2) {
			case 0:
				intent = new Intent(getApplicationContext(),CStartGameActivity.class);
				startActivity(intent);
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			default:
				break;
			}
		}
	}
}
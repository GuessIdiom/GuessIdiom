package ui.soundidentify.adapter;

import edu.fjnu.guess.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 听音识成语答案文字适配器
 * @author lingqiusang
 *
 */
public class SoundGuessAdapter extends BaseAdapter{
	private SharedPreferences sp;
	private int images[]=new int[]{R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,
			R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,
			R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,
			R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music};
	private String[] names = new String[]{"答案答案文字1","答案文字2","答案文字3","答案文字4",
										"答案文字5","答案文字6","答案文字7","答案文字8",
										"答案文字9","答案文字10","答案文字11","答案文字12",
										"答案文字13","答案文字14","答案文字15","答案文字16"};
	private LayoutInflater mInflater;
	public SoundGuessAdapter(Context context){
		// TODO Auto-generated constructor stub
		mInflater = LayoutInflater.from(context);
		sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return names.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return names[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = mInflater.inflate(R.layout.gamestart_item, null);

/*		TextView tv_modelselect_item = (TextView) view.findViewById(R.id.tv_modelselect_item);
		tv_modelselect_item.setRawInputType(position);*/

		return view;

	}
	
}

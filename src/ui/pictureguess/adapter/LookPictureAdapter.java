package ui.pictureguess.adapter;

import edu.fjnu.guess.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
/**
 * 看图猜成语答案文字适配器
 * @author lingqiusang
 *
 */
public class LookPictureAdapter extends BaseAdapter {
	private SharedPreferences sp;
	private int images[]=new int[]{R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,
			R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,
			R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,
			R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music,R.drawable.answer_bkg_music};
	private String[] names = new String[]{"关卡1","关卡2","关卡3","关卡4",
										"关卡5","关卡6","关卡7","关卡8",
										"关卡9","关卡10","关卡11","关卡12",
										"关卡13","关卡14","关卡15","关卡16"};
	private LayoutInflater mInflater;
	public LookPictureAdapter(Context context){
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
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return names[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		View view = mInflater.inflate(R.layout.lookpicture_item, null);
		return view;
	}

}

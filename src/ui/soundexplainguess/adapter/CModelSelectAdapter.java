package ui.soundexplainguess.adapter;


import edu.fjnu.guess.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CModelSelectAdapter extends BaseAdapter {

	private SharedPreferences sp;
	private int images[]=new int[]{R.drawable.s1,R.drawable.suo,R.drawable.suo,
			R.drawable.suo,R.drawable.suo,R.drawable.suo,
			R.drawable.suo,R.drawable.suo,R.drawable.suo,};
	private String[] names = new String[]{"关卡1","关卡2","关卡3","关卡4","关卡5","关卡6","关卡7","关卡","关卡9"};
	private LayoutInflater mInflater;
	public CModelSelectAdapter(Context context) {
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
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View view = mInflater.inflate(R.layout.modelselect_item, null);

		ImageView iv_modelselect_item = (ImageView) view.findViewById(R.id.iv_modelselect_item);
		TextView tv_modelselect_item = (TextView) view.findViewById(R.id.tv_modelselect_item);

		iv_modelselect_item.setImageResource(images[position]);

		if(position == 0){
			String name = sp.getString("name", names[position]);
			tv_modelselect_item.setText(name);
		}else{
			tv_modelselect_item.setText(names[position]);
		}


		return view;
	}

}

package com.example.jiang.findrom;

import java.util.List;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.location.LocationClientOption.LocationMode;
import com.baidu.location.Poi;
import com.example.jiang.R;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class RomRusltActivity extends Activity {
	public LocationClient mLocationClient = null;
	public BDLocationListener myListener = new MyLocationListener();
	private TextView locationView;
	private ListView resultList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.search_rom_layout);
		locationView = (TextView) findViewById(R.id.textView1);
		mLocationClient = new LocationClient(getApplicationContext()); // 声明LocationClient类
		mLocationClient.registerLocationListener(myListener); // 注册监听函数
		initLocation();
		mLocationClient.start();
		resultList = (ListView) findViewById(R.id.result_list);
		resultList.setAdapter(adapter);
	}

	private void initLocation() {
		LocationClientOption option = new LocationClientOption();
		option.setLocationMode(LocationMode.Hight_Accuracy);// 可选，默认高精度，设置定位模式，高精度，低功耗，仅设备
		option.setCoorType("gcj02");// 可选，默认gcj02，设置返回的定位结果坐标系
		int span = 1000;
		option.setScanSpan(span);// 可选，默认0，即仅定位一次，设置发起定位请求的间隔需要大于等于1000ms才是有效的
		option.setIsNeedAddress(true);// 可选，设置是否需要地址信息，默认不需要
		option.setOpenGps(true);// 可选，默认false,设置是否使用gps
		option.setLocationNotify(true);// 可选，默认false，设置是否当gps有效时按照1S1次频率输出GPS结果
		option.setIsNeedLocationDescribe(true);// 可选，默认false，设置是否需要位置语义化结果，可以在BDLocation.getLocationDescribe里得到，结果类似于“在北京天安门附近”
		option.setIsNeedLocationPoiList(true);// 可选，默认false，设置是否需要POI结果，可以在BDLocation.getPoiList里得到
		option.setIgnoreKillProcess(false);// 可选，默认false，定位SDK内部是一个SERVICE，并放到了独立进程，设置是否在stop的时候杀死这个进程，默认杀死
		option.SetIgnoreCacheException(false);// 可选，默认false，设置是否收集CRASH信息，默认收集
		option.setEnableSimulateGps(false);// 可选，默认false，设置是否需要过滤gps仿真结果，默认需要
		mLocationClient.setLocOption(option);
	}

	public class MyLocationListener implements BDLocationListener {

		@Override
		public void onReceiveLocation(BDLocation location) {
			/*
			 * // Receive Location StringBuffer sb = new StringBuffer(256);
			 * sb.append("time : "); sb.append(location.getTime());
			 * sb.append("\nerror code : "); sb.append(location.getLocType());
			 * sb.append("\nlatitude : "); sb.append(location.getLatitude());
			 * sb.append("\nlontitude : "); sb.append(location.getLongitude());
			 * sb.append("\nradius : "); sb.append(location.getRadius()); if
			 * (location.getLocType() == BDLocation.TypeGpsLocation) {// GPS定位结果
			 * sb.append("\nspeed : "); sb.append(location.getSpeed());//
			 * 单位：公里每小时 sb.append("\nsatellite : ");
			 * sb.append(location.getSatelliteNumber());
			 * sb.append("\nheight : "); sb.append(location.getAltitude());//
			 * 单位：米 sb.append("\ndirection : ");
			 * sb.append(location.getDirection());// 单位度 sb.append("\naddr : ");
			 * sb.append(location.getAddrStr()); sb.append("\ndescribe : ");
			 * sb.append("gps定位成功");
			 * 
			 * } else if (location.getLocType() ==
			 * BDLocation.TypeNetWorkLocation) {// 网络定位结果
			 * sb.append("\naddr : "); sb.append(location.getAddrStr()); //
			 * 运营商信息 sb.append("\noperationers : ");
			 * sb.append(location.getOperators()); sb.append("\ndescribe : ");
			 * sb.append("网络定位成功"); } else if (location.getLocType() ==
			 * BDLocation.TypeOffLineLocation) {// 离线定位结果
			 * sb.append("\ndescribe : "); sb.append("离线定位成功，离线定位结果也是有效的"); }
			 * else if (location.getLocType() == BDLocation.TypeServerError) {
			 * sb.append("\ndescribe : ");
			 * sb.append("服务端网络定位失败，可以反馈IMEI号和大体定位时间到loc-bugs@baidu.com，会有人追查原因"
			 * ); } else if (location.getLocType() ==
			 * BDLocation.TypeNetWorkException) { sb.append("\ndescribe : ");
			 * sb.append("网络不同导致定位失败，请检查网络是否通畅"); } else if
			 * (location.getLocType() == BDLocation.TypeCriteriaException) {
			 * sb.append("\ndescribe : ");
			 * sb.append("无法获取有效定位依据导致定位失败，一般是由于手机的原因，处于飞行模式下一般会造成这种结果，可以试着重启手机"
			 * ); } sb.append("\nlocationdescribe : ");
			 * sb.append(location.getLocationDescribe());// 位置语义化信息 List<Poi>
			 * list = location.getPoiList();// POI数据 if (list != null) {
			 * sb.append("\npoilist size = : "); sb.append(list.size()); for
			 * (Poi p : list) { sb.append("\npoi= : "); sb.append(p.getId() +
			 * " " + p.getName() + " " + p.getRank());
			 * sb.append(location.getAddrStr()); } }
			 */

			if (location == null) {

				return;

			}

			StringBuffer sb = new StringBuffer(256);

			/*sb.append("Time : ");

			sb.append(location.getTime());

			sb.append("\nError code : ");

			sb.append(location.getLocType());

			sb.append("\nLatitude : ");

			sb.append(location.getLatitude());

			sb.append("\nLontitude : ");

			sb.append(location.getLongitude());

			sb.append("\nRadius : ");

			sb.append(location.getRadius());*/

			if (location.getLocType() == BDLocation.TypeGpsLocation) {

				/*sb.append("\nSpeed : ");

				sb.append(location.getSpeed());

				sb.append("\nSatellite : ");

				sb.append(location.getSatelliteNumber());
				sb.append("\nAddress : ");*/
				sb.append(location.getAddrStr());

			} else if (location.getLocType() == BDLocation.TypeNetWorkLocation) {

				//sb.append("\nAddress : ");

				sb.append(location.getAddrStr());

			}
			if(sb.toString() != null){
				//sb.append("\n检查位置更新次数：");
				locationView.setText(sb.toString());
				mLocationClient.stop();
			}

			

			Log.i("BaiduLocationApiDem", sb.toString());

		}

	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if(mLocationClient.isStarted()){
			mLocationClient.stop();
		}
	}
	
	private BaseAdapter adapter = new BaseAdapter() {
		
		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			LayoutInflater flater = LayoutInflater.from(RomRusltActivity.this);
			View view = flater.inflate(R.layout.rom_item, null);
			ImageView icon = (ImageView) view.findViewById(R.id.rom_icon);
			TextView info = (TextView) view.findViewById(R.id.rom_info);
			icon.setId(R.drawable.room1);
			info.setText(R.string.addroom2);
			
			return view;
		}
		
		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 5;
		}
	};
	
	
	

}

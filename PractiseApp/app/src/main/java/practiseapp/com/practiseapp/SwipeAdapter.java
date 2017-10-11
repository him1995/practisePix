package practiseapp.com.practiseapp;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Harshi on 11-10-2017.
 */

public class SwipeAdapter extends PagerAdapter {
    private int[] ImageResources = {R.drawable.Sample1,R.drawable.Sample2};
    private Context ctx;
    private LayoutInflater LayoutInflater;

    public SwipeAdapter(Context ctx)
    {
        this.ctx=ctx;
    }

    @Override
    public int getCount() {
        return ImageResources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(ConstraintLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = LayoutInflater.inflate(R.layout.swipe_layout,container,false);
        ImageView imageView = (ImageView)item_view.findViewById(R.id.imageview);
        TextView textView = (TextView)item_view.findViewById(R.id.image_count);
        imageView.setImageResource(ImageResources[position]);
        textView.setText("Image"+position);
        container.addView(item_view);
        return item_view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ConstraintLayout)object);
    }
}


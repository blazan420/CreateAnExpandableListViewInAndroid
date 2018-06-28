import android.content.Context;
import android.graphics.Color;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class ExpandableListViewAdapter extends BaseExpandableListAdapter{


    String[] groupNames = {"Sport", "Computer", "Food", "Car", "TV"};
    String[][] childNames = {{"Boxing", "Lick Boxing", "Judo", "Football", "Basketball"},
            {"Desktop Computer", "Laptop Computer","SmartPhone Computer", "SpaceForce Computer"},
            {"Ice Cream", "Banana"}, {"Mercedes Benz"}, {"Samsung TV", "LG TV"}};

    //Constructor
    Context context;

    public ExpandableListViewAdapter(Context context) {

        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return groupNames.length;
    }

    @Override
    public int getChildrenCount(int i) {
        return childNames.length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groupNames[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childNames[groupPosition][childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View view, ViewGroup parent) {

        TextView txtView = new TextView(context);
        txtView.setText(groupNames[groupPosition]);
        txtView.setPadding(100,0,0,0);
        txtView.setTextColor(Color.BLUE);
        txtView.setTextSize(40);
        return txtView;

    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

public class ExpandableListViewAdapter extends BaseExpandableListAdapter{


    String[] groupNames = {"Sport", "Computer", "Food", "Car", "TV"};
    String[][] childNames = {{"Boxing", "Lick Boxing", "Judo", "Football", "Basketball"},
            {"Desktop Computer", "Laptop Computer", "SpaceForce Computer"},
            {"Ice Cream", "Banana"}, {"Mercedes Benz"}, {"Samsung TV", "LG TV"}};

    @Override
    public int getGroupCount() {
        return 0;
    }

    @Override
    public int getChildrenCount(int i) {
        return 0;
    }

    @Override
    public Object getGroup(int i) {
        return null;
    }

    @Override
    public Object getChild(int i, int i1) {
        return null;
    }

    @Override
    public long getGroupId(int i) {
        return 0;
    }

    @Override
    public long getChildId(int i, int i1) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}

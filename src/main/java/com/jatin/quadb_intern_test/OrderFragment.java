package com.jatin.quadb_intern_test;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.jatin.quadb_intern_test.model.Brands;
import com.jatin.quadb_intern_test.model.Restaurants;
import com.jatin.quadb_intern_test.ui.FilterAdapter;
import com.jatin.quadb_intern_test.ui.PersonAdapter;
import com.jatin.quadb_intern_test.ui.RestaurantAdapter;
import com.jatin.quadb_intern_test.ui.TopBrandsAdapter;

import java.util.ArrayList;

public class OrderFragment extends Fragment {

    private Button seeMore;
    private LinearLayout linearLayout1, linearLayout2;
    private boolean flag;
    private int width;
    private ArrayList<Integer> list;
    private ArrayList<Brands> list2;
    private ArrayList<String> list3;
    private ArrayList<Restaurants> list4;
    private ImageButton seeMoreButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_order_fragment, container, false);
        RecyclerView recyclerViewPerson = v.findViewById(R.id.recyclerView_person);
        RecyclerView recyclerViewTopBrands = v.findViewById(R.id.recyclerView_top_brands);
        RecyclerView recyclerViewFilters = v.findViewById(R.id.recyclerView3);
        RecyclerView recyclerViewRestaurants = v.findViewById(R.id.recyclerViewRestaurants);
        recyclerViewPerson.setHasFixedSize(true);
        recyclerViewPerson.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerViewTopBrands.setHasFixedSize(true);
        recyclerViewTopBrands.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerViewFilters.setHasFixedSize(true);
        recyclerViewFilters.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerViewRestaurants.setHasFixedSize(true);
        recyclerViewRestaurants.setLayoutManager(new LinearLayoutManager(getActivity()));
        list = new ArrayList<>();
        list.add(R.drawable.naruto1);
        list.add(R.drawable.naruto2);
        list.add(R.drawable.naruto3);
        list.add(R.drawable.naruto4);
        list.add(R.drawable.naruto5);
        flag = true;
        PersonAdapter personAdapter = new PersonAdapter(getActivity(), list);
        recyclerViewPerson.setAdapter(personAdapter);
        personAdapter.notifyDataSetChanged();

        seeMore = v.findViewById(R.id.see_more);
        linearLayout1 = v.findViewById(R.id.neighbour1);
        linearLayout2 = v.findViewById(R.id.neighbour2);
        seeMoreButton = v.findViewById(R.id.see_more_image);
        seeMoreButton.setBackgroundResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
        width = linearLayout1.getMeasuredWidth();

        list2 = new ArrayList<>();
        Brands brand = new Brands(R.drawable.mcd, "Mc Donalds", 40);
        list2.add(brand);
        brand = new Brands(R.drawable.dominos, "Dominos", 34);
        list2.add(brand);
        brand = new Brands(R.drawable.pizza_hut, "Pizza hut", 37);
        list2.add(brand);
        brand = new Brands(R.drawable.btw, "BTW", 24);
        list2.add(brand);
        brand = new Brands(R.drawable.kfc, "KFC", 43);
        list2.add(brand);

        TopBrandsAdapter topBrandsAdapter = new TopBrandsAdapter(getActivity(), list2);
        recyclerViewTopBrands.setAdapter(topBrandsAdapter);
        topBrandsAdapter.notifyDataSetChanged();

        list3 = new ArrayList<>();
        list3.add("Filters");
        list3.add("Rating: 4.0+");
        list3.add("Safe And Hygienic");
        list3.add("Takeaway");
        list3.add("Fastest Delivery");
        list3.add("Rating");

        FilterAdapter filterAdapter = new FilterAdapter(getActivity(), list3);
        recyclerViewFilters.setAdapter(filterAdapter);
        filterAdapter.notifyDataSetChanged();

        list4 = new ArrayList<>();
        Restaurants brand1 = new Restaurants(R.drawable.mcd, "Mc Donalds", 40, "4.0");
        list4.add(brand1);
        brand1 = new Restaurants(R.drawable.dominos, "Dominos", 34, "4.2");
        list4.add(brand1);
        brand1 = new Restaurants(R.drawable.pizza_hut, "Pizza hut", 37, "3.9");
        list4.add(brand1);
        brand1 = new Restaurants(R.drawable.btw, "BTW", 24, "3.8");
        list4.add(brand1);
        brand1 = new Restaurants(R.drawable.kfc, "KFC", 43, "4.0");
        list4.add(brand1);
        brand1 = new Restaurants(R.drawable.burger_king, "KFC", 43, "4.2");
        list4.add(brand1);

        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(getActivity(), list4);
        recyclerViewRestaurants.setAdapter(restaurantAdapter);
        restaurantAdapter.notifyDataSetChanged();




        seeMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(linearLayout1.getMeasuredWidth(), 0, 0);
                    linearLayout1.setLayoutParams(layoutParams);
                    linearLayout2.setLayoutParams(layoutParams);
                    seeMoreButton.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                    flag = false;
                }
                else{
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(linearLayout1.getMeasuredWidth(), 0, 1);
                    linearLayout1.setLayoutParams(layoutParams);
                    linearLayout2.setLayoutParams(layoutParams);
                    seeMoreButton.setBackgroundResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
                    flag = true;

                }
            }
        });

        return v;
    }


}

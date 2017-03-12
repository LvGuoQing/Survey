package cn.edu.cqu.survey;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/3/12.
 */

public class TwelfthActivity extends Activity {
    private List<Fruit> fruitList=new ArrayList<Fruit>();

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.twelfth);


        initFruits();//初始化水果

        FruitAdapter adapter=new FruitAdapter(TwelfthActivity.this,

                R.layout.fruit_item, fruitList);

        ListView listView=(ListView) findViewById(R.id.list_view);


        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent, View view, int position,

                                    long id) {



                Fruit fruit=fruitList.get(position);

                Toast.makeText(TwelfthActivity.this,

                        fruit.getName(), Toast.LENGTH_SHORT).show();

            }



        });


    }



    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        //getMenuInflater().inflate(R.menu.main, menu);

        return true;

    }




    public void initFruits() {

        Fruit apple = new Fruit("apple", R.drawable.apple);

        fruitList.add(apple);

        Fruit banana = new Fruit("banana", R.drawable.apple);

        fruitList.add(banana);

        Fruit orange = new Fruit("orange", R.drawable.apple);

        fruitList.add(orange);

        Fruit watermelon = new Fruit("watermelon", R.drawable.apple);

        fruitList.add(watermelon);

        Fruit pear = new Fruit("pear", R.drawable.apple);

        fruitList.add(pear);

        Fruit grape = new Fruit("grape", R.drawable.apple);

        fruitList.add(grape);

        Fruit pineapple = new Fruit("pineapple", R.drawable.apple);

        fruitList.add(pineapple);

        Fruit strawberry = new Fruit("strawberry", R.drawable.apple);

        fruitList.add(strawberry);

        Fruit cherry = new Fruit("cherry", R.drawable.apple);
        fruitList.add(cherry);
        Fruit mango = new Fruit("mango", R.drawable.apple);
        fruitList.add(mango);

    }


}

package com.example.homework_pinterest;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Post> posts = new ArrayList<Post>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        loadData();
        initRV();
    }

    private void loadData() {
        posts.add(new Post("https://i.mdel.net/i/db/2022/3/1668193/1668193-500w.jpg","https://i.pinimg.com/736x/0c/22/ab/0c22abf2df4ce97b9d835f38f44c3f3b.jpg","fvhgvkgu11"));
        posts.add(new Post("https://assets.vogue.com/photos/589148b0b482c0ea0e4d73df/master/pass/00-holding-sex-and-the-city.jpg","https://media.cnn.com/api/v1/images/stellar/prod/190923154252-naomi-campbell-1994.jpg?q=w_1110,c_fill","B2929"));
        posts.add(new Post("https://after40glow.com/wp-content/uploads/2024/09/fall-trends-suede-1-min.jpg","https://i.pinimg.com/236x/03/d4/bc/03d4bc8b46b1bd2c5d7ef03243997105.jpg","uyuu33"));
        posts.add(new Post("https://lh4.googleusercontent.com/SBLANSRC2qCriJo5ep3v_caFgkEut9zG93HqAOuzWQ8eJ0qhaQDhIKmT78t8E6k1J_aiwBx5AbDmqc3apAF_VmecMsy0rpo_t7aT2pXtMigSXl5A8h3H9CnQYZul5NWBm5FWKMYU","https://i.pinimg.com/236x/d0/94/dc/d094dcaa30ddf07b19b94516a1b6f16b.jpg","wefew21"));
        posts.add(new Post("https://media.cnn.com/api/v1/images/stellar/prod/190923154252-naomi-campbell-1994.jpg?q=w_1110,c_fill","https://lh4.googleusercontent.com/SBLANSRC2qCriJo5ep3v_caFgkEut9zG93HqAOuzWQ8eJ0qhaQDhIKmT78t8E6k1J_aiwBx5AbDmqc3apAF_VmecMsy0rpo_t7aT2pXtMigSXl5A8h3H9CnQYZul5NWBm5FWKMYU","ikkal3"));
        posts.add(new Post("https://i0.wp.com/farahfsalem.com/wp-content/uploads/2024/07/Fall-2024-fashion-trends-.jpg?fit=1414%2C2000&ssl=1","https://content.api.news/v3/images/bin/1e0fc7d6e55b49bd41e4e94b12eacb5d?width=1024","uuuu"));
        posts.add(new Post("https://www.refinery29.com/images/11769015.jpg?format=webp&width=720&height=864&quality=85","https://ffashionfrenzy.com/cdn/shop/articles/c6757c6a-b1b8-460c-a4db-769aa7040449.webp?v=1719227131&width=1100","l11iza"));
        posts.add(new Post("https://images.squarespace-cdn.com/content/v1/5faecb8fb23a85370058aed8/ea21ff49-23f4-44ad-801f-9f1a4f67d870/bella-hadid.png","https://hips.hearstapps.com/hmg-prod/images/90s-fashion-tyra-banks-6543c645c4133.png","123nooo"));
    }

    private void initRV() {
        RecyclerView  recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        PostAdapter adapter = new PostAdapter(this.getLayoutInflater(),posts);
        recyclerView.setAdapter(adapter);
    }

}
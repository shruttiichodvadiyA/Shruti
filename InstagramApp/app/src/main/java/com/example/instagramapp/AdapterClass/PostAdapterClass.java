package com.example.instagramapp.AdapterClass;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagramapp.InterfaceClass.PostInterface;
import com.example.instagramapp.ModelClass.PostModelClass;
import com.example.instagramapp.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostAdapterClass extends RecyclerView.Adapter<PostAdapterClass.myviewholder>{

     PostInterface postInterface;
    ArrayList<PostModelClass> postlist;

    public PostAdapterClass(ArrayList<PostModelClass> postlist, PostInterface postInterface) {
        this.postlist=postlist;
        this.postInterface=postInterface;
    }

    @NonNull
    @Override
    public PostAdapterClass.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.postview_,parent,false);
        myviewholder myviewholder=new myviewholder(view);
        return myviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapterClass.myviewholder holder, int position) {

        holder.imguser.setImageResource((postlist.get(position).getUserpic()));
        holder.txtuser.setText(String.valueOf(postlist.get(position).getUsername()));
        holder.imgpost.setImageResource(postlist.get(position).getPostpic());
        holder.layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                postInterface.setpostdata(postlist.get(position).getUsername(),(postlist.get(position).getUserpic()),postlist.get(position).getPostpic());

            }
        });
    }

    @Override
    public int getItemCount() {
        return postlist.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        CircleImageView imguser;
        TextView txtuser;
        ImageView imgpost;
        LinearLayout layout2;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            imguser=itemView.findViewById(R.id.imguser);
            txtuser=itemView.findViewById(R.id.txtuser);
            imgpost=itemView.findViewById(R.id.imgpost);
            layout2=itemView.findViewById(R.id.layout2);
        }
    }
}

package fr.epita.android.todo


import android.app.Activity
import android.jhaniteshkumar.com.hellointents.R
import android.jhaniteshkumar.com.hellointents.ToDoObject

import android.view.LayoutInflater

import android.view.View

import android.view.ViewGroup

import android.widget.BaseAdapter

import android.widget.ImageView

import android.widget.TextView


class ToDoListAdapter(val context: Activity, val data: List<ToDoObject>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val itemView: View

        if (convertView == null) {
            itemView = LayoutInflater.from(context)
                .inflate(R.layout.list_item_todo, parent, false)
        } else {
            itemView = convertView
        }
        val userIdtextView: TextView = itemView.findViewById(R.id.list_item_userid)


        userIdtextView.text = getItem(position).userID.toString()

        titleTextView.text = getItem(position).title

        if (getItem(position).Completed) {
            completedImageView.setImageResource(android.R.drawable.star_big_on)
        } else {
            completedImageView.setImageResource(android.R.drawable.star_big_off)
        }
        return itemView
    }
    override fun getItem(position: Int): ToDoObject {
        return data[position]
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getCount(): Int {
        return data.size

    }

}
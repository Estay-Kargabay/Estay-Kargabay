package com.demo.demo

import android.R.attr.data
import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.MainThread
import androidx.recyclerview.widget.RecyclerView
import com.demo.demo.module.userData
import kotlin.concurrent.thread
import android.view.View as ViewView


class UserdataAdapter (private val userList:ArrayList<userData>): RecyclerView.Adapter<UserdataAdapter.ViewHolder>()
{   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.recylerview_item_row,parent,false)
        return ViewHolder(v)}
    override fun getItemCount(): Int = userList.size
    override fun onBindViewHolder(holder: UserdataAdapter.ViewHolder, position: Int) {
        holder.bindData(userList[position] )
        holder.itemView.setOnClickListener {
        Log.d("main","hello $position")}}

    class ViewHolder(itemView: ViewView):RecyclerView.ViewHolder(itemView)
    {fun bindData(userlistdata:userData) {
    val username = itemView.findViewById<TextView>(R.id.username)
    val address = itemView.findViewById<TextView>(R.id.content_text)
    username.text=userlistdata.username.toString()
    address.text=userlistdata.address.toString()
}}}
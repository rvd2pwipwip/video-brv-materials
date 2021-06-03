package com.raywenderlich.android.creatures.ui

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.android.creatures.R
import com.raywenderlich.android.creatures.app.inflate
import com.raywenderlich.android.creatures.model.Creature

class CreatureAdapter(private val creatures: List<Creature>): RecyclerView.Adapter<CreatureAdapter.ViewHolder>() {

    inner class ViewHolder(v: View): RecyclerView.ViewHolder(v) {

    }

    //only called a few times (enough to fill the container plus a few extras above and below)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item_creature, parent, false)
//        return  ViewHolder(itemView)
        return ViewHolder(parent.inflate(R.layout.list_item_creature)) //uses inflate of ViewGroupExtensions
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val creature = CreatureStore.getCreatures()[position]

    }

    override fun getItemCount(): Int {
        return creatures.size
    }

}
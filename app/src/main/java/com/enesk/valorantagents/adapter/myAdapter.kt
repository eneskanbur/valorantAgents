package com.enesk.valorantagents.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.enesk.valorantagents.databinding.CardViewBinding
import com.enesk.valorantagents.model.Agent
import com.enesk.valorantagents.view.AgentListFragment
import com.enesk.valorantagents.view.AgentListFragmentDirections

class myAdapter(val agentList : List<Agent>) : RecyclerView.Adapter<myAdapter.myViewHolder>(){

    class myViewHolder(val binding: CardViewBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val cardViewBinding= CardViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return myViewHolder(cardViewBinding)
    }

    override fun getItemCount(): Int {
        return agentList.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.binding.agentName.text = agentList[position].getName()
        holder.binding.agentImage.setImageResource(agentList[position].getImage())
        holder.itemView.setOnClickListener{
            val action = AgentListFragmentDirections.actionAgentListFragmentToAgentFeaturesFragment(agentList[position])
            Navigation.findNavController(it).navigate(action)
        }
    }
}
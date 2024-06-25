package com.enesk.valorantagents.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enesk.valorantagents.R
import androidx.recyclerview.widget.GridLayoutManager
import com.enesk.valorantagents.adapter.myAdapter
import com.enesk.valorantagents.databinding.FragmentAgentListBinding
import com.enesk.valorantagents.model.Agent
import com.enesk.valorantagents.model.AgentAbilitiesClass


class AgentListFragment : Fragment() {

    private var _binding: FragmentAgentListBinding? = null
    private lateinit var agentAbilities : AgentAbilitiesClass
    private lateinit var agents: ArrayList<Agent>
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        agentAbilities = AgentAbilitiesClass()
        val brimstone = Agent("Brimstone", "Controller", agentAbilities.brimstoneAbilities, R.drawable.brimstone)
        val viper = Agent("Viper", "Controller", agentAbilities.viperAbilities, R.drawable.viper)
        val omen = Agent("Omen", "Controller", agentAbilities.omenAbilities, R.drawable.omen)
        val killjoy = Agent("Killjoy", "Sentinel", agentAbilities.killjoyAbilities, R.drawable.killjoy)
        val cypher = Agent("Cypher", "Sentinel", agentAbilities.cypherAbilities, R.drawable.cypher)
        val sova = Agent("Sova", "Initiator", agentAbilities.sovaAbilities, R.drawable.sova)
        val sage = Agent("Sage", "Sentinel", agentAbilities.sageAbilities, R.drawable.sage)
        val phoenix = Agent("Phoenix", "Duelist", agentAbilities.phoenixAbilities, R.drawable.phoenix)
        val jett = Agent("Jett", "Duelist", agentAbilities.jettAbilities, R.drawable.jett)
        val reyna = Agent("Reyna", "Duelist", agentAbilities.reynaAbilities, R.drawable.reyna)
        val raze = Agent("Raze", "Duelist", agentAbilities.razeAbilities, R.drawable.raze)
        val breach = Agent("Breach", "Initiator", agentAbilities.breachAbilities, R.drawable.breach)
        val skye = Agent("Skye", "Initiator", agentAbilities.skyeAbilities, R.drawable.skye)
        val yoru = Agent("Yoru", "Duelist", agentAbilities.yoruAbilities, R.drawable.yoru)
        val astra = Agent("Astra", "Controller", agentAbilities.astraAbilities, R.drawable.astra)
        val kayo = Agent("KAY/O", "Initiator", agentAbilities.kayoAbilities, R.drawable.kayo)
        val chamber = Agent("Chamber", "Sentinel", agentAbilities.chamberAbilities, R.drawable.chamber)
        val neon = Agent("Neon", "Duelist", agentAbilities.neonAbilities, R.drawable.neon)
        val fade = Agent("Fade", "Initiator", agentAbilities.fadeAbilities, R.drawable.fade)
        val harbor = Agent("Harbor", "Controller", agentAbilities.harborAbilities, R.drawable.harbor)
        val gekko = Agent("Gekko","Initiator",agentAbilities.gekkoAbilities,R.drawable.gekko)
        val deadlock = Agent("Deadlock","Sentinel",agentAbilities.deadlockAbilities,R.drawable.deadlock)
        val iso = Agent("Iso","Duelist",agentAbilities.isoAbilities,R.drawable.iso)
        val clove = Agent("Clove","Controller",agentAbilities.cloveAbilities,R.drawable.clove)
        agents = arrayListOf(neon,brimstone,yoru,sage,viper,omen,kayo,killjoy,cypher,sova
            ,phoenix,jett,reyna,raze,breach,skye,chamber,astra,fade,harbor,gekko,deadlock,iso,clove)

        _binding = FragmentAgentListBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter= myAdapter(agents)
        binding.recyclerViewId.layoutManager = GridLayoutManager(this@AgentListFragment.context,2)
        binding.recyclerViewId.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
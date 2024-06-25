package com.enesk.valorantagents.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enesk.valorantagents.R
import com.enesk.valorantagents.databinding.FragmentAgentFeaturesBinding


class AgentFeaturesFragment : Fragment() {

    private var _binding: FragmentAgentFeaturesBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAgentFeaturesBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val agent = AgentFeaturesFragmentArgs.fromBundle(it)
            binding.agentFeatureName.text = agent.agent.getName()
            binding.imageView.setImageResource(agent.agent.getImage())
            binding.agentFeatureRole.text = agent.agent.getRole()

            val textViews = listOf(
                binding.firstAbilities,
                binding.secondAbilities,
                binding.thirdAbilities,
                binding.ultAbilities,)
            agent.agent.getAbilities().forEachIndexed{index, ability ->
                textViews[index].text = ability
            }

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
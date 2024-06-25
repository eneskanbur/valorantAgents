package com.enesk.valorantagents.model

import android.graphics.drawable.Drawable
import android.os.Parcelable
import java.io.Serializable

open class Agent(private val agentName: String, private val agentRole: String, private val agentAbilities: List<String>, private val image : Int) : Serializable {

    fun getName(): String{
        return agentName
    }

    fun getRole() : String{
        return "Role: ${agentRole}"
    }

    fun getAbilities() : List<String>{
        return agentAbilities
    }

    fun getImage() : Int{
        return image
    }
}
## Valorant Agents - README

This project showcases a mobile application listing Valorant agents and their abilities. 

### Getting Started

1. Clone the repository using Git:

```bash
git clone https://<repository_url>.git
```

2. Open the project in Android Studio.

3. Ensure you have the Android SDK and tools installed.

4. Run the application on an Android device or emulator.


### Application Functionality

The application consists of two main functionalities:

1. **Agent List:** Displays a list of Valorant agents with their roles and profile pictures. Clicking on an agent navigates to the agent details screen.

2. **Agent Details:** Displays a detailed breakdown of the selected agent's abilities. This includes the agent's name, role, image, and a list of their abilities (first, second, third, and ultimate).


### Technologies Used

* Android Studio
* Kotlin
* RecyclerView
* CardView

### Project Structure

* **app**: Contains the main application code.
    * **model**: Stores the data model classes for agents and their abilities.
        * `Agent.kt`: Defines the Agent class with properties for name, role, abilities, and image resource ID. 
    * **view**: Contains the user interface classes and layouts for both fragments.
        * `AgentListFragment.kt`: Manages the fragment displaying the agent list.
        * `AgentFeaturesFragment.kt`: Manages the fragment displaying the details of a selected agent.
        * `fragment_agent_features.xml`: Layout file for the agent details fragment.
        * `fragment_agent_list.xml`: Layout file for the agent list fragment.
        * `item_agent_card.xml`: Layout file for each agent card displayed in the list.
    * **adapter**: Contains the adapter class for the agent list.
        * `myAdapter.kt`: Handles populating the RecyclerView with agent data.

### Additional Notes

* This is a sample application and can be further extended to include functionalities like agent filtering, searching, and ability descriptions.
* The `AgentAbilitiesClass` class referenced in the code (`AgentListFragment.kt`) is likely not included in the provided code snippets. You'll need to implement this class to manage the agent ability data.

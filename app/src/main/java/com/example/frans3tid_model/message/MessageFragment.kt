package com.example.frans3tid_model.Home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.frans3tid_model.R
import com.example.frans3tid_model.databinding.FragmentMessageBinding
import com.example.frans3tid_model.message.MessageAdapter
import com.example.frans3tid_model.message.MessageModel
import com.example.frans3tid_model.message.tutorial.TutorialMessageActivity

class MessageFragment : Fragment() {
    private var _binding: FragmentMessageBinding? = null
    private val binding get() = _binding!!

    private val messageList = listOf(
        MessageModel("Alya", "Halo! Apa kabar?", "https://i.pravatar.cc/150?img=1", 21),
        MessageModel("Budi", "Sudah makan?", "https://i.pravatar.cc/150?img=2", 22),
        MessageModel("Citra", "Jangan lupa tugasnya ya!", "https://i.pravatar.cc/150?img=3", 20),
        MessageModel("Dika", "Besok kita rapat jam 9", "https://i.pravatar.cc/150?img=4", 23),
        MessageModel("Eka", "Nice job kemarin!", "https://i.pravatar.cc/150?img=5", 29),
        MessageModel("Fajar", "Lagi ngapain?", "https://i.pravatar.cc/150?img=6", 24),
        MessageModel("Gita", "Boleh minta tolong?", "https://i.pravatar.cc/150?img=7", 26),
        MessageModel("Hana", "Lihat email ya", "https://i.pravatar.cc/150?img=8", 20),
        MessageModel("Irfan", "Oke noted", "https://i.pravatar.cc/150?img=9", 25),
        MessageModel("Joko", "Sampai jumpa besok", "https://i.pravatar.cc/150?img=10", 40)
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMessageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1. Setup Title Toolbar secara langsung
        binding.toolbar.title = "Message"

        // 2. Pasang Menu ke Toolbar secara manual (Cara ini aman dan tidak akan crash)
        binding.toolbar.inflateMenu(R.menu.message_toolbar_menu)

        // 3. Listener saat ikon Info/Tutorial diklik
        binding.toolbar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.action_tutorial -> {
                    val intent = Intent(requireContext(), TutorialMessageActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

        // 4. Setup Adapter RecyclerView Message
        val adapter = MessageAdapter(requireContext(), messageList)
        binding.listMessageItems.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
package com.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer2Fragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_singer2, container, false)

        val items = mutableListOf<String>()
        items.add("사랑은 늘 도망가")
        items.add("이제 나만 믿어요")
        items.add("그대라는 사치")
        items.add("다시 사랑한다면")
        items.add("잊었니")
        items.add("별빛 같은 나의 사랑아")
        items.add("HERO")
        items.add("끝사랑")
        items.add("Bk love")
        items.add("계단 말고 엘리베이터")
        items.add("어느 60대 노부부이야기")
        items.add("바램")
        items.add("보라빛 엽서")
        items.add("미워요")
        items.add("오래된 노래")
        items.add("잊어야 한다는 마음으로")
        items.add("어느날 문득")
        items.add("사랑의 아픔 딛고")
        items.add("목로주점")
        items.add("그 중에 그대를 만나")
        items.add("가슴은 알죠")
        items.add("그런 사람 또 없습니다")
        items.add("일편단심 민들레야")
        items.add("상사화")

        val rv = view.findViewById<RecyclerView>(R.id.singRV2)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.Youngtak).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer1Fragment)
        }

        view.findViewById<ImageView>(R.id.Songgain).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer3Fragment)
        }

        return view
    }
}
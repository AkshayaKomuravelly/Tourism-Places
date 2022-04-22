package com.example.tourismplaces.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tourismplaces.R
import com.example.tourismplaces.adapter.TourismAdapter
import com.example.tourismplaces.databinding.FragmentAdilabadBinding
import com.example.tourismplaces.model.TourismModel


class AdilabadFragment : Fragment() {

    private lateinit var binding: FragmentAdilabadBinding
    private val tourList = generateList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentAdilabadBinding.inflate(inflater, container, false)

        setupRecyclerview()

        return binding.root
    }

    private fun setupRecyclerview() {
        binding.rvAdilabad.adapter = TourismAdapter(tourList)
        binding.rvAdilabad.layoutManager = LinearLayoutManager(activity)
    }

    private fun generateList(): List<TourismModel> {

        val list = ArrayList<TourismModel>()
        list.add(TourismModel(R.drawable.adb_basara,"Basar Saraswati Temple","Here is located the ancient temple of Gnana Sarasvati - the Goddess of Knowledge. It is believed to be one of the two oldest temples of Goddess Saraswati in India, the other being located in Kashmir. Sited at the convergence of rivers Mangira and Godavari, Saraswati Temple appears serene and pious in the rustic setting.\n" +"\n" + "According to the legends, Veda Vyas did penance on the banks of Godavari. He used to bring fistful of sand daily after bath to make idols of Goddess Saraswati, Lakshmi and Kali. Since the 6th century, Basar has been a pilgrimage centre for the Hindus. However, the present structure of the temple is believed to have been erected by Chalukya kings.Saraswati is the Hindu Goddess of knowledge and learning. Children are brought to the temple for the learning ceremony called as Akshara abyasam."
            ,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background))
        list.add(TourismModel(R.drawable.adb_kuntala_waterfalls,"Kuntala Waterfall","The Kuntala Waterfalls is located 12 kms from the Neredikonda villege, about 64 km from Adilabad. At Kuntala,the Kadem river cascades 45 meters down and rushes deep into the Jungles. Kuntala, the highest waterfalls in the State, offers a spectacular sight particularly when the river is flush with copious inflows. The winter months are ideal for witnessing the waterfalls, as one can also see the river in all its glory. There is an image of Lord Shiva near the water falls known as Someshwara Swami. Many devotees congregate here for Maha Shiva Ratri festivities.",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background))
        list.add(TourismModel(R.drawable.ic_launcher_background,"Kadam Dam","It Is Known For:-\n" +
                "1) Kadam Dam was built for the provision of water in Adilabad region and at present, it provides water in 68000 hectares of Adilabad district\n" +
                "2) This dam is located among the tantalizing surroundings and becomes a favorable place for nature lovers\n" +
                "3) The reservoir created by this dam is a navigable water body and visitors can relish boating as well as swimming in the reservoir created by this dam\n" +
                "\n" +
                "Best Time To Visit:-\n" +
                "Kadam Dam, being a famous tourist attraction, draws the attention of visitors on a large scale. People from nearby regions arrive at this place for enjoying a captivating view of the river Godavari flowing. Thus, it can be visited throughout the year, especially during monsoons. It is the time when the beauty of this place is enhanced by a rain shower."
            ,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background))
        list.add(TourismModel(R.drawable.adb_pochera_waterfalls,"Pochera Waterfalls","Located only 37 kms away from the bustling town of Nirmal, the Pochera Waterfall is the highlight of Telangana. With the white waters powerfully plummeting from the height of a whopping 20 meters, the Pochera Waterfall is the deepest waterfalls of the entire Telangana region.\n" +
                "\n" +
                "It may surprise you to know that the bed of the Pochera waterfall is entirely made from the purest form of granite. This gives the waterfall a slight emerald tinge, making them all the more tantalizing. You can take a relaxing dip in these falls and splash around with friends and family, or you could sit by the waters staring at the majestic allure of the falls as the hypnotic murmur of the plummeting waters appeases every nerve in your body. ",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background))
        list.add(TourismModel(R.drawable.ic_launcher_background,"Kawal Wildlife Sanctuary","Situated in old Adilabad, Kawal Wildlife Sanctuary is famous for its enormous variety of flora and fauna. The smell of the wilderness, untouched and uninhabited regions where animals thrive in harmony is precisely what Kawal Wildlife Sanctuary is all about. Kawal wildlife sanctuary tiger reserve also has a rich and varied population of Cheetahs.\n" +
                "\n" +"Established in 1965, Kawal Wildlife Sanctuary was declared as a protected area in the region. Before being recognized as a reserve, the sanctuary was the hunting grounds of the Nizams who ruled the region. In order to protect the population of Tigers, the sanctuary was later recognized as a Tiger Reserve. Kawal Wildlife Reserve also serves as a catchment area for River Kadam, which is a tributary of River Godavari.",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background))
        list.add(TourismModel(R.drawable.adb_jainath_temple,"Jainath Temple","Built-in Jain style of architecture, Jainath Temple is located 21 km from Adilabad in Jainath Village. The temple is renowned for its Prakrit stone inscribed with 20 slokas that suggest that the temple was built under Pallava chief.\n" +
                "\n" +
                "The temple is visited by a large number of devotees especially between Karthika Sudda Ashtami and Bahula Saptami. Lord Lakshmi Narayana Swami Temple located in the vicinity of this temple is also a major shrine.",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background))
        list.add(TourismModel(R.drawable.ic_launcher_background,"Gayatri Waterfalls","Gayatri Falls is a beautiful cascading waterfall over River Kadem in the Adilabad district of Telangana. Colloquially known as Gadidha Gundam or Mukti Gundam, the waterfalls are secretly tucked in between the deep woods of the Tarnam Khurd Village.\n" +
                "\n" +
                "Popular for beautiful scenic views and panoramic vistas, the spot also offers moderate to challenging trekking opportunities and is best visited during monsoons. The lesser-known Gayatri waterfalls is usually visited with the Pochera and Kuntala Falls situated in close vicinity. ",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background))
        return list

    }

}
package com.example.uts

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {

    private lateinit var listView: ListView
    private lateinit var adapter: AdapterBerita

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listView = view.findViewById(R.id.listView)
        val beritaList = listOf(
            DataBerita("300 Juta Data Dukcapil Diduga Bocor, Kominfo Lakukan Prosedur Standar", "Kementerian Komunikasi dan Informatika (Kominfo) menyebut pihaknya akan melakukan prosedur standar untuk menelusuri dugaan kebocoran data Kependudukan dan Pencatatan Sipil (Dukcapil).",
                "Sebelumnya, sebanyak 337 juta data masyarakat di Direktorat Dukcapil Kementerian Dalam Negeri (Kemendagri) diduga mengalami kebocoran dan dijual di forum online hacker BreachForums.\n" +
                        "\n" +
                        "Kebocoran itu diungkap Teguh Aprianto, pendiri Ethical Hacker Indonesia, di media sosial pada Minggu (16/7). Teguh menjelaskan data yang dipastikan bocor adalah nama, Nomor Induk Kependudukan (NIK), nomor Kartu Keluarga (KK), tanggal lahir, alamat, nama ayah, nama ibu, NIK ibu, nomor akta lahir, nomor akta nikah dan lainnya.", "https://example.com/image1.jpg"),

            DataBerita("Tarif Rp24 Ribu Rute Terjauh LRT Dinilai Wajar", "PENGAMAT transportasi Djoko Setijowarno mengungkapkan tarif LRT Jabodebek yang diputuskan oleh Kementerian Perhubungan sebesar Rp24 ribu untuk rute terjauh dari Stasiun Harjamukti ke Dukuh Atas sudah wajar dan sesuai.",
                "Dalam sebuah survei kecil-kecilan yang pernah ia lakukan, warga Bekasi dan Bogor yang mengendarai mobil untuk bekerja ke Jakarta setiap hari rata-rata mengeluarkan biaya Rp75 ribu hingga Rp100 ribu per hari.\n" +
                        "\n" +
                        "“Itu termasuk tarif tol, bensin, dan biaya parkir,” ujarnya.\n" +
                        "\n" +
                        "Kementerian Perhubungan melalui Badan Pengelola Transportasi Jabodebek (BPTJ) menyediakan layanan pengumpan atau ‘feeder’ dalam bentuk bus. BPTJ sebelumnya sudah memiliki layanan ini melalui bus JR Connexion. Penyediaan bus atau angkutan pengumpan ini juga bisa bekerja sama dengan pemda setempat yang wilayahnya dilalui oleh LRT Jabodebek.\n" +
                        "\n" +
                        " “Yang harus dilakukan adalah menekan ongkos dari rumah ke stasiun. Ini bisa dengan bus. Busnya wara-wiri saja dari komplek perumahan ke stasiun bayar Rp10 ribu. Ini sudah cukup menjanjikan bisa menekan,” tuturnya. \n" +
                        "\n" +
                        "Penyediaan bus pengumpan, dinilainya lebih efektif ketimbang menyediakan sarana kantong parkir atau ‘park and ride’. Sebab, berbeda dengan PT KCI yang memiliki lahan luas di beberapa area stasiunnya sehingga bisa menyediakan parkir, Kemenhub tidak memiliki lahan di sekitar stasiun-stasiun LRT Jabodebek yang bisa dijadikan lahan parkir.", "https://example.com/image1.jpg"),

            DataBerita("Indonesia Juara SEA V League 2023 Pekan Pertama", "TIMNAS voli putra Indonesia berhasil meraih gelar juara SEA V League 2023 pekan pertama usai mengalahkan Thailand 3-1 (21-25, 25-17, 25-23, dan 27-25) di GOR Candradimuka Padepokan Voli Jenderal Polisi Kunarto, Sentul, Bogor, Minggu (23/7) malam.",
                "Dua laga sebelumnya didapatkan dari Filipina dan Vietnam dengan skor sama 3-0.  Pelatih timnas Indonesia Jeff Jiang mengaku bangga dengan perjuangan anak asuhnya di laga pamungkas. “Saya bangga dengan anak-anak. Mereka bekerja keras dan bermain baik.  Teamwork juga sangat baik, berbeda dengan saat di Cina Taipei, mungkin kalau di Taipei bermain seperti ini kami bisa menang,” ujar Jiang.\n" +
                        "\n" +
                        "Di Filipina pekan ini, Indonesia akan turun dengan materi pemain yang sama. Di Filipina, akan berlangsung event yang sama pekan kedua, pada 28-30 Juli mendatang. Sementara tim Thailand akan turun dengan materi pemain yang berbeda. Pasalnya, tim Thailand yang berlaga di Sentul ini akan langsung bertolak ke Qatar menghadapi FIVB Challenge Cup 2023 pada pekan depan. Pemain terbaik (MVP), Fahri Septian Putratama menyebut laga terakhir ini dia dan rekan-rekannya bermain lebih baik. “Semua berjalan sesuai rencana,” kata Fahri.\n" +
                        "\n" +
                        "Kekalahan di Taiwan dari Thailand, katanya juga sudah dievaluasi. “Thailand sebenarnya bermain sama seperti di Taiwan tetapi kami bermain jauh lebih baik dibanding di Taiwan,” lanjut Fahri.", "https://example.com/image1.jpg"),

            DataBerita("Bandara Soekarno-Hatta Direvitalisasi, Catat Area yang Terdampak", "Bandara Soekarno-Hatta, Tangerang, Banten akan direvitalisasi selama sekitar enam bulan ke depan. Hal ini dilakukan untuk meningkatkan kapasitas dan produktivitas pergerakan penumpang dan pesawat.",
                "Bandara Soekarno-Hatta, Tangerang, Banten akan direvitalisasi selama sekitar enam bulan ke depan. Hal ini dilakukan untuk meningkatkan kapasitas dan produktivitas pergerakan penumpang dan pesawat. “Kurang lebih sekitar enam bulan lagi ini semua bisa diselesaikan sehingga dapat memenuhi demand yang semakin meningkat. Bandara Soetta akan menjadi showcase-nya negara Indonesia di mata dunia,” ujar Menteri Perhubungan Budi Karya Sumadi, Sabtu (22/7/2023), seperti dikutip dari keterangan tertulis yang diterima Kompas.com.Budi Karya menambahkan, kapasitas Bandara Soekarno-Hatta akan ditingkatkan menjadi 110 juta penumpang per tahun, dari kapasitas sebelumnya 65 juta per tahun. Kapasitas Bandara Soekarno-Hatta akan ditingkatkan menjadi 110 juta penumpang per tahun, dari kapasitas sebelumnya 65 juta per tahun. \n" +
                        "\n" +
                        "Jika berencana terbang dari atau ke Bandara Soekarno-Hatta, ketahui beberapa area yang menjadi objek revitalisasi. Untuk sisi darat (land side) dikerjakan oleh Angkasa Pura II (AP II) bersama kontraktor PT PP di Terminal 1B dan 1C domestik, sementara di Terminal 2F internasional dikerjakan oleh AP II dan Adhi Karya. ", "https://example.com/image1.jpg"),

            DataBerita("Indonesia Akan Dijadikan Industri Baterai Mobil Listrik Terbesar", "Menteri Investasi/Kepala Badan Koordinasi Penanaman Modal (BKPM) Bahlil Lahadalia melaporkan bahwa Indonesia ditargetkan menjadi negara industri baterai mobil listrik terbesar. Caranya dengan program hilirisasi sumber daya alam, terutama bahan baku baterai.",
                "Menteri Investasi/Kepala Badan Koordinasi Penanaman Modal (BKPM) Bahlil Lahadalia melaporkan bahwa Indonesia ditargetkan menjadi negara industri baterai mobil listrik terbesar. Caranya dengan program hilirisasi sumber daya alam, terutama bahan baku baterai.\n" +
                        "\n" +
                        "Beberapa bahan baku utama dari baterai kendaraan listrik tersebut adalah nikel, kobalt, mangan dan litium. Menurut Bahlil, Indonesia memiliki cadangan nikel sebanyak 25 persen dari total secara global.\n" +
                        "\n" +
                        "“Kita ingin menjadikan Indonesia sebagai salah satu negara industrialis baterai mobil terbesar di dunia,” kata Bahlil dalam sebuah sesi kuliah umum online di Universitas Sebelas Maret, dikutip Tempo.co dari kantor berita Antara hari ini, Rabu, 23 Agustus 2023.", "https://example.com/image1.jpg"),

            DataBerita("Banjir Terjang 28 Desa di Aceh Tenggara, 4.843 Jiwa Terdampak", "Banjir masih melanda wilayah Aceh Tenggara, Provinsi Aceh. Banjir pada sejumlah desa berlangsung sejak Kamis 17 Agustus 2023 membuat 4.843 jiwa terdampak, namun tidak ada laporan warga terdampak yang mengungsi. ",
                "Banjir masih melanda wilayah Aceh Tenggara, Provinsi Aceh. Banjir pada sejumlah desa berlangsung sejak Kamis 17 Agustus 2023 membuat 4.843 jiwa terdampak, namun tidak ada laporan warga terdampak yang mengungsi. \n" +
                        "\n" +
                        "Badan Penanggulangan Bencana Daerah (BPBD) Kabupaten Aceh Tenggara mencatat sejumlah 28 desa atau gampong yang tersebar di 5 kecamatan dilanda banjir.\n" +
                        "\n" +
                        "“Populasi terdampak, BPBD mendata sebanyak 1.177 KK atau 4.843 jiwa. Penanganan darurat telah diupayakan BPBD setempat sejak awal kejadian,” ungkap Kepala Pusat Data, Informasi dan Komunikasi Kebencanaan BNPB, Abdul Muhari, Senin (21/8/2023).", "https://example.com/image1.jpg"),

            DataBerita("Jepang Krisis Populasi, Jumlah Warga Anjlok di Semua Prefektur", "Untuk pertama kalinya Jepang mencatat rekor populasi terendah pada 2022. Penurunan populasi ini bahkan terjadi di semua prefektur di Jepang. Menurut data pemerintah Jepang per Rabu (26/7), jumlah populasi di Jepang turun selama 14 tahun berturut-turut.",
                "Kemendagri Jepang menyebut penurunan populasi secara keseluruhan merupakan penurunan tertajam yang tercatat sejak tahun 1968.\n" +
                        "\n" +
                        "“Penurunan jumlah anak dan populasi adalah masalah penting yang melibatkan masalah sosial, ekonomi, dan kesejahteraan sosial. Sebaliknya, jumlah populasi warga negara asing di Jepang justru meningkat dengan rekor 289.498 orang atau 10,7 persen menjadi 2.993.839 orang. Ini merupakan kenaikan jumlah WNA tertinggi sejak 2013.\n" +
                        "\n" +
                        "Jepang punya aturan imigrasi yang cukup ketat. Namun beberapa tahun terakhir, Negeri Matahari Terbit mulai melonggarkan batasan secara bertahap, demi mengatasi masalah kekurangan tenaga kerja.", "https://example.com/image1.jpg"),

            DataBerita("Siswa SMA Belajar di Lokasi Darurat, Pemkab Klaten Siapkan Rp 4 Miliar", "Pemkab Klaten menyiapkan anggaran Rp 4 miliar gegara siswa baru SMAN I Karangnongko kelas jauh belajar di tenda dan aula kantor Desa Tlogowatu, Kecamatan Kemalang. Anggaran sebesar itu untuk pengadaan lahan yang akan dibangun gedung sekolah.",
                "Pemkab Klaten menyiapkan anggaran Rp 4 miliar gegara siswa baru SMAN I Karangnongko kelas jauh belajar di tenda dan aula kantor Desa Tlogowatu, Kecamatan Kemalang. Anggaran sebesar itu untuk pengadaan lahan yang akan dibangun gedung sekolah.\n" +
                        "\n" +
                        "“Sementara kemarin kita itu punya uang ganti rugi proyek tol dari tanah asetnya Dinas Kebudayaan Pemuda Olah dan Pariwisata yang kena, kurang lebih Rp 4 miliar. Sangat cukup, insyaallah kalau cuma satu hektare cukup,” ungkap Sekda Kabupaten Klaten, Jajang Prihono kepada wartawan di Pemkab Klaten, Senin (7/8/2023) siang.", "https://example.com/image1.jpg"),

            DataBerita("1 Keuntungan Timnas Indonesia Jelang Semifinal Piala AFF U-23 2023", "Timnas Indonesia U-23 berhasil lolos dari lubang jarum dan akan berlaga di babak semifinal Piala AFF U-23 2023. Skuad Garuda Muda punya keuntungan dibandingkan Thailand.",
                "Deskripsi Berita 1 untuk DetailActivityTimnas Indonesia U-23 berhasil lolos dari lubang jarum dan akan berlaga di babak semifinal Piala AFF U-23 2023. Skuad Garuda Muda punya keuntungan dibandingkan Thailand.\n" +
                        "\n" +
                        "Timnas Indonesia yang sudah lebih dulu bermain pada Minggu (20/8) harus menanti selama dua hari untuk menentukan kelanjutan nasib mereka. Setelah menyimak hasil-hasil yang ada selama dua hari, Timnas Indonesia U-23 akhirnya ikut memperoleh tiket menuju babak semifinal.", "https://example.com/image1.jpg"),

            DataBerita("Partai Buruh Dukung Demonstrasi Tolak Kenaikan UMP 2024 di Bawah 15 Persen di Berbagai Daerah", "Partai Buruh dan Konfederasi Serikat Pekerja Indonesia (KSPI) mendukung langkah kaum buruh yang belakangan masif melakukan demonstrasi perihal penolakan kenaikan Upah Minimum Provinsi atau UMP 2024 yang dinilai masih tak mencukupi kebutuhan sehari-hari.",
                "Partai Buruh dan Konfederasi Serikat Pekerja Indonesia (KSPI) mendukung langkah kaum buruh yang belakangan masif melakukan demonstrasi perihal penolakan kenaikan Upah Minimum Provinsi atau UMP 2024 yang dinilai masih tak mencukupi kebutuhan sehari-hari.\n" +
                        "\n" +
                        "“Kaum buruh menuntut para gubernur di wilayah industri seperti DKI Jakarta, Jawa Barat, Jawa Tengah, Banten, Kepulauan Riau, dan daerah lainnya agar dilakukan revisi penetapan kenaikan UMP 2024,” kata Presiden Partai Buruh Said Iqbal dalam konferensi pers via Zoom, Jumat, 15 Desember 2023.", "https://example.com/image1.jpg")
            // Tambahkan item berita lainnya di sini
        )

        adapter = AdapterBerita(requireContext(), R.layout.item_berita, beritaList)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedBerita = beritaList[position]
            val intent = Intent(activity, DetailBeritaActivity::class.java).apply {
                putExtra("title", selectedBerita.title)
                putExtra("desc", selectedBerita.descListView)
                putExtra("imageUrl", selectedBerita.imageUrl)
            }
            startActivity(intent)
        }
    }
}

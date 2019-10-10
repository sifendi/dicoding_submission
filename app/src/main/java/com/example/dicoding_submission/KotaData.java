package com.example.dicoding_submission;

import java.util.ArrayList;

public class KotaData {


    private static String[] kotaNames = {
            "Surabaya",
            "Semarang",
            "Jakarta",
            "Jogja",
            "Bali",
            "Bandung",
            "NTB",
            "NTT",
            "Makassar",
            "Sumbar"
    };

    private static String[] kotaDetails = {
            "Kota Surabaya adalah ibu kota Provinsi Jawa Timur, Indonesia, sekaligus kota metropolitan terbesar di provinsi tersebut. Surabaya merupakan kota terbesar kedua di Indonesia setelah Jakarta. Kota ini terletak 796 km sebelah timur Jakarta, atau 415 km sebelah barat laut Denpasar, Bali.",
            "Kota Semarang adalah ibu kota Provinsi Jawa Tengah, Indonesia sekaligus kota metropolitan terbesar kelima di Indonesia sesudah Jakarta, Surabaya, Medan, dan Bandung",
            "Daerah Khusus Ibukota Jakarta adalah ibu kota negara dan kota terbesar di Indonesia. Jakarta merupakan satu-satunya kota di Indonesia yang memiliki status setingkat provinsi. Jakarta terletak di pesisir bagian barat laut Pulau Jawa",
            "Daerah Istimewa Yogyakarta adalah Daerah Istimewa setingkat provinsi di Indonesia yang merupakan peleburan Negara Kesultanan Yogyakarta dan Negara Kadipaten Paku Alaman. Daerah Istimewa Yogyakarta terletak di bagian selatan Pulau Jawa, dan berbatasan dengan Provinsi Jawa Tengah dan Samudera Hindia",
            "Bali adalah sebuah pulau di Indonesia yang dikenal karena memiliki pegunungan berapi yang hijau, terasering sawah yang unik, pantai, dan terumbu karang yang cantik. Terdapat banyak tempat wisata religi seperti Pura Uluwatu yang berdiri di atas tebing. Di Selatan, kota pesisir pantai Kuta menawarkan wisata hiburan malam yang tak pernah sepi, sementara Seminyak, Sanur, dan Nusa Dua dikenal dengan suguhan resort yang populer. Pulau Bali juga dikenal sebagai tempat untuk relaksasi dengan yoga dan meditasi",
            "Kota Bandung merupakan kota metropolitan terbesar di Provinsi Jawa Barat, sekaligus menjadi ibu kota provinsi tersebut. Kota ini terletak 140 km sebelah tenggara Jakarta, dan merupakan kota terbesar di wilayah Pulau Jawa bagian selatan",
            "Nusa Tenggara Barat ialah sebuah provinsi di Indonesia yang berada pada bagian barat Kepulauan Nusa Tenggara. Provinsi ini beribu kota di Mataram dan memiliki 10 Kabupaten dan Kota. Pada awal kemerdekaan Indonesia, wilayah ini termasuk dalam wilayah Provinsi Sunda Kecil yang beribu kota di Singaraja",
            "Nusa Tenggara Timur adalah sebuah provinsi di Indonesia.dan terdapat seorang anak yg bernama zaim rozin j.dia biasa di panggil jamlud/onta.dia sekolah di bogor gunung sindur. yang meliputi bagian timur Kepulauan Nusa Tenggara. Provinsi ini beribu kota di Kupang dan memiliki 22 Kabupaten/Kota",
            "Kota Makassar adalah ibu kota provinsi Sulawesi Selatan. Makassar merupakan kota metropolitan terbesar di kawasan Indonesia Timur dan pada masa lalu pernah menjadi ibu kota Negara Indonesia Timur dan Provinsi Sulawesi",
            "umatra Barat adalah sebuah provinsi di Indonesia yang terletak di Pulau Sumatra dengan Padang sebagai ibu kotanya. Provinsi Sumatra Barat terletak sepanjang pesisir barat Sumatra bagian tengah, dataran tinggi Bukit Barisan di sebelah timur, dan sejumlah pulau di lepas pantainya seperti Kepulauan Mentawai"
    };

    private static int[] kotaImages = {
            R.drawable.surabaya,
            R.drawable.semarang,
            R.drawable.jakarta,
            R.drawable.jogja,
            R.drawable.bali,
            R.drawable.bandung,
            R.drawable.ntb,
            R.drawable.ntt,
            R.drawable.makassar,
            R.drawable.sumbar
    };

    static ArrayList<Kota> getListData() {
        ArrayList<Kota> list = new ArrayList<>();
        for (int position = 0; position < kotaNames.length; position++) {
            Kota kotax = new Kota();
            kotax.setName(kotaNames[position]);
            kotax.setDetail(kotaDetails[position]);
            kotax.setPhoto(kotaImages[position]);
            list.add(kotax);
        }
        return list;
    }
}

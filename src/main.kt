import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.HttpURLConnection
import java.net.URL
import java.util.ArrayList


fun main() {

    val url ="https://cbu.uz/oz/arkhiv-kursov-valyut/json/"
    val connection:HttpURLConnection = URL(url).openConnection() as HttpURLConnection
    val inputStream = connection.inputStream
    val bufferedReader= inputStream.bufferedReader()
    val l = bufferedReader.readLine()
    print(l)

    val gson = Gson()
    val type = object :TypeToken<ArrayList<Mymoney>>(){}.type
    val list = gson.fromJson<ArrayList<Mymoney>>(l,type)
    for (myMoney in list){
        println(myMoney
        )
    }

}



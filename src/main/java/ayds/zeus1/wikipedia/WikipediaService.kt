package ayds.zeus1.wikipedia

import ayds.zeus1.wikipedia.entities.Article
import retrofit2.http.Query

interface WikipediaService {
    fun getArticle(@Query("srsearch") artist: String): Article?
}
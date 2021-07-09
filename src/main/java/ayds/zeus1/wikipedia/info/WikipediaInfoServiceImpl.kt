package ayds.zeus1.wikipedia.info

import ayds.zeus1.wikipedia.WikipediaService
import ayds.zeus1.wikipedia.entities.Article
import retrofit2.Response

internal class WikipediaInfoServiceImpl(
    private val wikipediaInfoAPI: WikipediaInfoAPI,
    private val wikipediaToResolver: WikipediaToResolver
): WikipediaService {

    override fun getArticle(artist: String): Article? {
        val callResponse = getResponseFromService(artist)
        return wikipediaToResolver.getInfoFromExternalData(callResponse.body())
    }

    private fun getResponseFromService(artist: String): Response<String> =
            wikipediaInfoAPI.getArticle(artist).execute()
}
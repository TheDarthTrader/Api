package dt.core.api

import io.polygon.kotlin.sdk.DefaultJvmHttpClientProvider
import io.polygon.kotlin.sdk.HttpClientProvider
import io.polygon.kotlin.sdk.rest.AggregatesParameters
import io.polygon.kotlin.sdk.rest.PolygonRestClient

class PolygonApi(key: String,
                 httpClientProvider: HttpClientProvider = DefaultJvmHttpClientProvider(),
                 polygonApiDomain: String = "api.polygon.io"
): PolygonRestClient(key, httpClientProvider, polygonApiDomain) {
    private var key: String = key


}

//fun main() {
//    val client = PolygonApi("")
//    client.getAggregates(AggregatesParameters(
//        "APPL",
//        1,
//
//    ))
//}
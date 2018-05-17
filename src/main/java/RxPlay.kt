import io.reactivex.Maybe
import io.reactivex.Observable

fun main(args: Array<String>) {
    Maybe.just(null).subscribe(::println)
}
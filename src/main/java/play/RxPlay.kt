package play

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

fun main() {
  val a = PublishSubject.create<Int>()
  val b = PublishSubject.create<Int>()
  val c = PublishSubject.create<Int>()

  Observable.merge(listOf(a, b, c).map { it.map { it * 3 } })
      .subscribe { println(it) }

  a.onNext(3)
  b.onNext(2)
  c.onNext(6)
  a.onNext(1)
}
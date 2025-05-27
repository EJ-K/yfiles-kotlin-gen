// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.collections

import js.array.ReadonlyArray
import yfiles.lang.IClassMetadata
import yfiles.lang.InterfaceMetadata

/**
 * Defines ways to iterate over the items contained in this type by providing a method to get an [IEnumerator].
 * @param [T] The type of the enumerable objects.
 * @see [from]
 * @see [toArray]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable">Online Documentation</a>
 */
external interface IEnumerable<out T>  {
  /**
   * Returns the number of elements of this enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23size">Online Documentation</a>
   */
  final val size: Int
  
  /**
   * Creates a wrapped enumerable that has one or several elements appended to it.
   * @param [items] The item(s) to prepend to the enumeration
   * @return A new live view over the original enumerable that has each of the `items` appended to it.
   * @see [prepend]
   * @see [concat]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-append">Online Documentation</a>
   */
  final fun append(
    vararg items: @UnsafeVariance T,
  ): IEnumerable<T> = definedExternally
  
  /**
   * Returns the element at the given `index` in this enumerable.
   * @param [index] The index of the element to return. Supports relative indexing from the end of the enumerable when passed a negative index. In other words, if a negative number is used, the returned element will be found by counting back from the end of the enumerable.
   * @return The element at the given `index`, or `null` if the index is not within the valid range of this enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-at">Online Documentation</a>
   */
  final fun at(
    index: Int,
  ): T? = definedExternally
  
  /**
   * Concatenates this enumerable with the given other `elements` in a new dynamic [IEnumerable].
   * @param [elements] Rest arguments to be appended. In case the elements are enumerable-like, too, they will be will be enumerated after the others have been enumerated. But this can also be simple objects of type `T` in which case they will be appended to the enumerable just like with [append][IEnumerable]
   * @return A dynamic composite enumerable.
   * @see [append]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-concat">Online Documentation</a>
   */
  final fun concat(
    vararg elements: IEnumerable<@UnsafeVariance T>,
  ): IEnumerable<T> = definedExternally
  
  /**
   * Creates a wrapped enumerable that yields each element only once.
   * @param [keySelector] The optional function that determines the key to determine distinctness of the elements. If omitted, the element itself is used.
   * @return A new live view over the original enumerable that yields each element with a given key at most once.
   * @see [HashMap]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-distinct">Online Documentation</a>
   */
  final fun distinct(
    keySelector: ShortKeySelector<T, Any>?  = definedExternally,
  ): IEnumerable<T> = definedExternally
  
  /**
   * Creates a wrapped view of an enumerable which drops the given amount of elements.
   * @param [amount] The number of elements to drop from the beginning. If negative, the elements will be skipped from the end of the enumeration.
   * @return A new live view over the original enumerable that drops `amount` elements.
   * @see [dropWhile]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-drop">Online Documentation</a>
   */
  final fun drop(
    amount: Int,
  ): IEnumerable<T> = definedExternally
  
  /**
   * Creates a wrapped view of an enumerable which skips a number of elements at the beginning while the given predicate yields `true`.
   * @param [predicate] The predicate function that determines what elements should be skipped. While the predicate yields `true` for the provided item, the element will not be yielded.
   * @return A new live view over the original enumerable that discards elements at the beginnging of the original enumeration while the predicate yields `true`.
   * @see [take]
   * @see [takeWhile]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-dropWhile">Online Documentation</a>
   */
  final fun dropWhile(
    predicate: ElementPredicate<T>,
  ): IEnumerable<T> = definedExternally
  
  /**
   * Determines whether every element of the enumerable matches the given `predicate`.
   * @param [predicate] A predicate function which returns `true` if the element matches a condition.
   * @return `true` if all elements of the enumerable match the given `predicate`, `false` otherwise.
   * @throws ArgumentError `predicate` is `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-every">Online Documentation</a>
   */
  final fun every(
    predicate: ElementPredicate<T>,
  ): Boolean = definedExternally
  
  /**
   * Returns a dynamic [IEnumerable] of the elements of this enumerable which match the given `predicate`.
   * @param [predicate] A predicate function which returns `true` if the given element should be included in the resulting enumerable.
   * @return A dynamic enumerable of the elements which match the given `predicate`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-filter(ElementPredicate,any)">Online Documentation</a>
   */
  final fun filter(
    predicate: ElementPredicate<T>,
  ): IEnumerable<T> = definedExternally
  
  /**
   * Returns the first element of the enumerable that matches a given `predicate` or `null` if there is no such element.
   * @param [predicate] A predicate function which returns `true` if the given element should be returned.
   * @return The first element of this enumerable that matches the predicate or `null` if there is no such element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-find">Online Documentation</a>
   */
  final fun find(
    predicate: ElementPredicate<T>,
  ): T? = definedExternally
  
  /**
   * Searches the enumerable for the first item for which `predicate` returns `true` and returns its index.
   * @param [predicate] A predicate function which returns `true` if an item matches the search conditions.
   * @return The index of the first item for which `predicate` returns `true` or -1 if there is no such item in the enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-findIndex">Online Documentation</a>
   */
  final fun findIndex(
    predicate: ElementPredicate<T>,
  ): Int = definedExternally
  
  /**
   * Returns the last element of the enumerable that matches a given `predicate` or `null` if there is no such element.
   * @param [predicate] A predicate function which returns `true` if the given element should be returned.
   * @return The last element of this enumerable that matches the predicate or `null` if there is no such element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-findLast">Online Documentation</a>
   */
  final fun findLast(
    predicate: ElementPredicate<T>,
  ): T? = definedExternally
  
  /**
   * Searches the enumerable for the last item for which `predicate` returns `true` and returns its index.
   * @param [predicate] A predicate function which returns `true` if an item matches the search conditions.
   * @return The index of the last item for which `predicate` returns `true` or -1 if there is no such item in the enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-findLastIndex">Online Documentation</a>
   */
  final fun findLastIndex(
    predicate: ElementPredicate<T>,
  ): Int = definedExternally
  
  /**
   * Returns the first element of this enumerable.
   * @return The first matching element of this enumerable or `null` if nothing was found.
   * @see [at]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-first">Online Documentation</a>
   */
  final fun first(): T = definedExternally
  
  /**
   * Returns a flattened dynamic [IEnumerable] of this enumerable using the given `selector` function which returns an enumerable for each element of this enumerable.
   * @param [TResult] The type of the elements of the result enumerable.
   * @param [selector] A function which returns an enumerable for each element of this enumerable.
   * @return A flattened dynamic enumerable of the enumerables provided for each element of this enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-flatMap">Online Documentation</a>
   */
  final fun <TResult> flatMap(
    selector: FlatMapSelector<T, TResult>,
  ): IEnumerable<TResult> = definedExternally
  
  /**
   * Iterates this enumerable and invokes the given function for each element with the element, its index, and this enumerable as arguments.
   * @param [action] The function to call for each element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-forEach">Online Documentation</a>
   */
  final fun forEach(
    action: ElementAction<T>,
  ): Unit = definedExternally
  
  /**
   * Gets an [IEnumerator] which can be used to enumerate the items this instance represents.
   * @return The [IEnumerator] which can be used to iterate over the items in this instance
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-method-getEnumerator">Online Documentation</a>
   */
  fun getEnumerator(): IEnumerator<T>
  
  /**
   * Groups the elements in the enumerable according to the equality of a key.
   * @param [TKey] The type of the key elements.
   * @param [TResult] The type of the created elements.
   * @param [keySelector] A function which selects from each element the key.
   * @param [resultCreator] An optional function which transforms each group of elements and their common key into a resulting object. If omitted, the default implementation will create arrays of length 2 where the first element is the key and the second element is an IEnumerable&lt;TSource> of the elements with the corresponding key.
   * @return An enumeration of groups of the original enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-groupBy">Online Documentation</a>
   */
  final fun <TKey, TResult> groupBy(
    keySelector: KeySelector<T, TKey>,
    resultCreator: ResultCreator<T, TKey, TResult>?  = definedExternally,
  ): IEnumerable<TResult> = definedExternally
  
  /**
   * Determines whether the given value is part of this enumerable.
   * @param [item] The value to search for.
   * @return `true` if this enumerable contains the given value, `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-includes">Online Documentation</a>
   */
  final fun includes(
    item: @UnsafeVariance T,
  ): Boolean = definedExternally
  
  /**
   * The index of the given item in the enumerable.
   * @param [item] The item to search for.
   * @return The index of the given item in the enumerable. `-1` if the item is not in the enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-indexOf">Online Documentation</a>
   */
  final fun indexOf(
    item: @UnsafeVariance T,
  ): Int = definedExternally
  
  /**
   * Returns the last element of this enumerable.
   * @return The last element of this enumerable, or `null` if the enumerable is empty.
   * @see [at]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-last">Online Documentation</a>
   */
  final fun last(): T = definedExternally
  
  /**
   * Returns a dynamic [IEnumerable] of this enumerable using the given `selector` function which returns a new object for each element of this enumerable.
   * @param [TResult] The type of the mapped elements.
   * @param [selector] A function which converts each element into a new element of the type `TResult`.
   * @return A dynamic enumerable of the results of the provided function.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-map">Online Documentation</a>
   */
  final fun <TResult> map(
    selector: Selector<T, TResult>,
  ): IEnumerable<TResult> = definedExternally
  
  /**
   * Converts this untyped enumerable into an enumerable with the given type.
   * @param [resultType] The type of the elements of the result enumerable.
   * @return A typed enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-ofType(number)">Online Documentation</a>
   */
  final fun ofType(
    resultType: Number,
  ): IEnumerable<Int> = definedExternally
  
  /**
   * Converts this untyped enumerable into an enumerable with the given type.
   * @param [resultType] The type of the elements of the result enumerable.
   * @return A typed enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-ofType(string)">Online Documentation</a>
   */
  final fun ofType(
    resultType: String,
  ): IEnumerable<String> = definedExternally
  
  /**
   * Converts this untyped enumerable into an enumerable with the given type.
   * @param [resultType] The type of the elements of the result enumerable.
   * @return A typed enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-ofType(boolean)">Online Documentation</a>
   */
  final fun ofType(
    resultType: Boolean,
  ): IEnumerable<Boolean> = definedExternally
  
  /**
   * Converts this untyped enumerable into an enumerable with the given type.
   * @param [TResult] The type of the elements of the result enumerable.
   * @param [resultType] The type of the elements of the result enumerable.
   * @return A typed enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-ofType(Constructor)">Online Documentation</a>
   */
  final fun <TResult> ofType(
    resultType: IClassMetadata<TResult>,
  ): IEnumerable<TResult> = definedExternally
  
  /**
   * Creates a wrapped enumerable that has on or several elements prepended to it.
   * @param [items] The item(s) to prepend to the enumeration
   * @return A new live view over the original enumerable that has `items` prepended to it.
   * @see [append]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-prepend">Online Documentation</a>
   */
  final fun prepend(
    vararg items: @UnsafeVariance T,
  ): IEnumerable<T> = definedExternally
  
  /**
   * Applies the `accumulator` function to this elements of this enumerable.
   * @param [accumulator] A function which "adds" (accumulates) a value depending on the element and index to the initial value and returns the result.
   * @return The result of the accumulation.
   * @see [reduce]
   * @see [reduceRight]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-reduce(Accumulator)">Online Documentation</a>
   */
  final fun reduce(
    accumulator: Accumulator<T, @UnsafeVariance T>,
  ): T = definedExternally
  
  /**
   * Applies the `accumulator` function to this elements of this enumerable.
   * @param [TAccumulate] The type of the accumulated value.
   * @param [accumulator] A function which "adds" (accumulates) a value depending on the element and index to the initial value and returns the result.
   * @param [initialValue] The initial value for the accumulator. Omit/use the [reduce][IEnumerable] overload if you don't want to specify an initial value.
   * @return The result of the accumulation.
   * @see [reduceRight]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-reduce(Accumulator,TAccumulate)">Online Documentation</a>
   */
  final fun <TAccumulate> reduce(
    accumulator: Accumulator<T, TAccumulate>,
    initialValue: TAccumulate?,
  ): TAccumulate = definedExternally
  
  /**
   * Applies the `accumulator` function to this elements of this enumerable in reverse order.
   * @param [accumulator] A function which "adds" (accumulates) a value depending on the element and index to the seed value and returns the result.
   * @return The result of the accumulation.
   * @see [reduceRight]
   * @see [reduce]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-reduceRight(Accumulator)">Online Documentation</a>
   */
  final fun reduceRight(
    accumulator: Accumulator<T, @UnsafeVariance T>,
  ): T = definedExternally
  
  /**
   * Applies the `accumulator` function to this elements of this enumerable in reverse order.
   * @param [TAccumulate] The type of the accumulated value.
   * @param [accumulator] A function which "adds" (accumulates) a value depending on the element and index to the seed value and returns the result.
   * @param [initialValue] The initial value for the accumulator. Omit/use the [reduceRight][IEnumerable] overload if you don't want to specify an initial value.
   * @return The final value of the accumulation.
   * @see [reduceRight]
   * @see [reduce]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-reduceRight(Accumulator,TAccumulate)">Online Documentation</a>
   */
  final fun <TAccumulate> reduceRight(
    accumulator: Accumulator<T, TAccumulate>,
    initialValue: TAccumulate,
  ): TAccumulate = definedExternally
  
  /**
   * Determines whether this enumerable contains any elements matching the given `predicate`.
   * @param [predicate] A function which returns `true` if the element matches a condition.
   * @return Whether this enumerable contains any elements matching the given `predicate`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-some">Online Documentation</a>
   */
  final fun some(
    predicate: ElementPredicate<T>?  = definedExternally,
  ): Boolean = definedExternally
  
  /**
   * Calculates the sum of the elements of this enumerable.
   * @param [selector] A function which returns a numeric value for the given element.
   * @return The sum of the elements of the enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-sum">Online Documentation</a>
   */
  final fun sum(
    selector: Selector<T, Int>,
  ): Double = definedExternally
  
  /**
   * Creates a dynamic view of this enumerable with the given number of elements taken from the start or end of this enumerable.
   * @param [count] The number of elements in the created enumerable. If the number is positive, the elements are taken from the beginning, otherwise, the elements are taken from the end.
   * @return A dynamic iew of this enumerable with the given number of elements.
   * @see [takeWhile]
   * @see [drop]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-take">Online Documentation</a>
   */
  final fun take(
    count: Int,
  ): IEnumerable<T> = definedExternally
  
  /**
   * Returns a dynamic [IEnumerable] that contains the elements from this enumerable as long as the given `predicate` is `true`.
   * @param [predicate] A function which returns `true` as long as the elements should be added to the returned enumerable.
   * @return A dynamic enumerable that is a subset of the original enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-takeWhile">Online Documentation</a>
   */
  final fun takeWhile(
    predicate: ElementPredicate<T>,
  ): IEnumerable<T> = definedExternally
  
  /**
   * Creates an array with the elements of this enumerable.
   * @return An array with the elements of this enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-toArray">Online Documentation</a>
   */
  final fun toArray(): ReadonlyArray<T> = definedExternally
  
  /**
   * Creates a [List] with the values of this enumerable.
   * @return A [List] of the elements of this enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-toList">Online Documentation</a>
   */
  final fun toList(): List<@UnsafeVariance T> = definedExternally
  
  /**
   * Returns an dynamic enumerable which contains the elements of this enumerable in reverse order.
   * @return A dynamic enumerable which contains the elements of the original enumerable in reverse order.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-toReversed">Online Documentation</a>
   */
  final fun toReversed(): IEnumerable<T> = definedExternally
  
  /**
   * Yields an ordered enumerable of the elements given an optional comparison function.
   * @param [comparator] A function with the signature `(a, b) => number` which is used for the sort operation to compare the elements in the enumerable. May be omitted. If omitted, the elements are sorted by converting them to strings first. Numbers are sorted as numbers without converting them to strings (this is different to the EcmaScript implementation).
   * @return A sorted enumeration of the original enumerable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-toSorted">Online Documentation</a>
   */
  final fun toSorted(
    comparator: ElementComparison<T>?  = definedExternally,
  ): IEnumerable<T> = definedExternally

  
  companion object : InterfaceMetadata<IEnumerable<*>> {
    /**
     * An empty, immutable instance of [IEnumerable].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23EMPTY">Online Documentation</a>
     */
     val EMPTY: IEnumerable<*>
    
    /**
     * Creates an enumerable that consists of the sequence of increasing values starting with `from` and a length of `count`.
     * @param [from] the first value to yield
     * @param [count] the number of values to yield
     * @return A new enumerable that can yield `count` numbers starting with `from`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-ofRange">Online Documentation</a>
     */
    fun ofRange(
      from: Int,
      count: Int,
    ): IEnumerable<Int>
    
    /**
     * Creates an enumerable that consists of `count` `item`s.
     * @param [T] The type of the element.
     * @param [item] The element to yield.
     * @param [count] The number of elements the new enumerable yields.
     * @return A new enumerable that can yield `count` `item`s
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-ofRepeat">Online Documentation</a>
     */
    fun <T> ofRepeat(
      item: T,
      count: Int,
    ): IEnumerable<T>
  }
}

inline val <T> IEnumerable<T>.lastIndex: Int
    get() = size - 1
/**
 * Determines whether the given value is part of this enumerable.
 * @param [item] The value to search for.
 * @return `true` if this enumerable contains the given value, `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerable%23IEnumerable-defaultmethod-includes">Online Documentation</a>
 */
inline operator fun <T> IEnumerable<T>.contains(
  item: T,
): Boolean {
  return  asDynamic().includes(item)
}

inline operator fun <T> IEnumerable<T>.component1(): T = at(0)!!
inline operator fun <T> IEnumerable<T>.component2(): T = at(1)!!
inline operator fun <T> IEnumerable<T>.component3(): T = at(2)!!
inline operator fun <T> IEnumerable<T>.component4(): T = at(3)!!
inline operator fun <T> IEnumerable<T>.component5(): T = at(4)!!

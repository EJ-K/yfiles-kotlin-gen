// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.collections

import yfiles.lang.IClassMetadata

/**
 * The accumulator to use for the [IEnumerable].
 * @param [total] The previously returned value of the function.
 * @param [element] The current element to accumulate.
 * @param [index] The element's index in the [IEnumerable]
 * @param [source] The enumerable this function is called upon.
 * @return A result of type `TAccumulate` created from the `element`.
 */
typealias Accumulator<TSource, TAccumulate> = (total: TAccumulate, element: TSource, index: Number, source: IEnumerable<TSource>) -> TAccumulate

/**
 * Callback delegate that can be used to query results of a virtual [lookup][ILookup] call on objects that don't necessarily implement `ILookup`.
 * @param [subject] the subject for which a lookup shall be made
 * @param [type] the type to look up
 * @return an instance that can be assigned to type or `null`
 */
typealias ContextLookupDelegate = (subject: Any, type: IClassMetadata<*>) -> Any?

/**
 * A delegate that mimics the [get][IMapper] access.
 * @param [key] The key of the mapping.
 * @return The value or a suitable default that is associated with `key`.
 */
typealias DataGetter<K, V> = (key: K) -> V?

/**
 * A delegate that mimics [IMapper]'s indexer write-access.
 * @param [key] The key of the mapping.
 * @param [value] The new value of the mapping.
 */
typealias DataSetter<K, V> = (key: K, value: V) -> Unit

/**
 * An action to execute for each element of an [IEnumerable].
 * @param [element] The current element.
 * @param [index] The element's index in the [IEnumerable]
 * @param [source] The enumerable this function is called upon.
 */
typealias ElementAction<T> = (element: T, index: Number, source: IEnumerable<T>) -> Unit

/**
 * Compares the given values.
 * @param [value1] The first value to compare.
 * @param [value2] The second value to compare.
 * @return A value less than 0 if value 1 is smaller than value2, 0 if both values are equal, greater than 0 otherwise.
 */
typealias ElementComparison<T> = (value1: T, value2: T) -> Number

/**
 * The predicate to use for [IEnumerable].
 * @param [element] The current element to test.
 * @param [index] The element's index in the [IEnumerable]
 * @param [source] The enumerable this function is called upon.
 * @return `true` if the item matches the condition.
 */
typealias ElementPredicate<T> = (element: T, index: Number, source: IEnumerable<T>) -> Boolean

/**
 * A function which provides a custom into a custom implementation of `TInterface` for the given `item`.
 * @param [item] The item to return the implementation for.
 * @return The new implementation.
 */
typealias Factory<TDecoratedType, TInterface> = (item: TDecoratedType) -> TInterface

/**
 * The selector to use for the [IEnumerable].
 * @param [element] The current element create a result for.
 * @param [index] The element's index in the [IEnumerable]
 * @param [source] The enumerable this function is called upon.
 * @return A result of type [IEnumerable] of `TResult` created from the `element`.
 */
typealias FlatMapSelector<TSource, TResult> = (element: TSource, index: Number, source: IEnumerable<TSource>) -> IEnumerable<TResult>

/**
 * A function which creates a key for the given `element`.
 * @param [element] The element to get the key for.
 * @param [index] The index of the element in the underlying [IEnumerable].
 * @param [source] The underlying [IEnumerable]
 */
typealias KeySelector<TSource, TKey> = (element: TSource, index: Number, source: IEnumerable<TSource>) -> TKey

/**
 * A function which transforms a group of elements and their common key into a resulting object.
 * @param [key] The key of the provided group.
 * @param [group] The group of elements with the given key.
 * @param [index] The index of the group.
 * @return A resulting object for the given group with the given key.
 */
typealias ResultCreator<TSource, TKey, TResult> = (key: TKey, group: IEnumerable<TSource>, index: Number) -> TResult

/**
 * The selector to use for the [IEnumerable].
 * @param [element] The current element create a result for.
 * @param [index] The element's index in the [IEnumerable]
 * @param [source] The enumerable this function is called upon.
 * @return A result of type `TResult` created from the `element`.
 */
typealias Selector<TSource, TResult> = (element: TSource, index: Number, source: IEnumerable<TSource>) -> TResult

/**
 * A function which creates a key for the given `element`.
 * @param [element] The element to get the key for.
 * @return The key for the element.
 */
typealias ShortKeySelector<TSource, TKey> = (element: TSource) -> TKey

/**
 * A function which wraps the `originalImplementation` of `TInterface` into a custom implementation for the given `item`.
 * @param [item] The item to return the wrapped implementation for.
 * @param [originalImplementation] The original implementation to wrap.
 * @return The new implementation.
 */
typealias WrapperFactory<TDecoratedType, TInterface> = (item: TDecoratedType, originalImplementation: TInterface) -> TInterface

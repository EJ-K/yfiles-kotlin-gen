// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.collections.IEnumerable
import yfiles.collections.IEnumerator
import yfiles.collections.IMap
import yfiles.collections.IMapper
import yfiles.collections.MapEntry
import yfiles.lang.ClassMetadata

/**
 * Represents a mapping from keys to values that is part of a result of running a graph analysis algorithm.
 * @param [TKey] The type of keys in this mapping, typically graph items.
 * @param [TValue] The type of the values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResultItemMapping">Online Documentation</a>
 */
external  class ResultItemMapping<TKey : Any, TValue : Any> 
private constructor () : IEnumerable<MapEntry<TKey, TValue>>, IMapper<TKey, TValue> {

/**
 * Gets all keys in this mapping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResultItemMapping%23keys">Online Documentation</a>
 */
final val keys: IEnumerable<TKey>
/**
 * Gets all values in this mapping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResultItemMapping%23values">Online Documentation</a>
 */
final val values: IEnumerable<TValue>
/**
 * Copies the entries of this mapping into the given `mapper`.
 * @param [mapper] The [IMapper] to copy the entries of this mapping to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResultItemMapping%23ResultItemMapping-method-copyTo(IMapper)">Online Documentation</a>
 */
 final   fun copyTo( mapper: IMapper<TKey, TValue> )
/**
 * Copies the entries of this mapping into the given `dictionary`.
 * @param [dictionary] The [IMap] to copy the entries of this mapping to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResultItemMapping%23ResultItemMapping-method-copyTo(IMap)">Online Documentation</a>
 */
 final   fun copyTo( dictionary: IMap<TKey, TValue> )
/**
 * Gets the value for a given key in the mapping.
 * @param [key] The key of the mapping.
 * @return The value.
 * @throws InvalidOperationError when trying to set a value.
 * @see [set]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResultItemMapping%23ResultItemMapping-method-get">Online Documentation</a>
 */
 override  operator fun get( key: TKey ):TValue?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResultItemMapping%23ResultItemMapping-method-getEnumerator">Online Documentation</a>
 */
 final override   fun getEnumerator():IEnumerator<MapEntry<TKey, TValue>>
/**
 * Sets the value for a given key in the mapping.
 * @param [key] The key of the mapping.
 * @param [value] The value.
 * @throws InvalidOperationError when trying to set a value.
 * @see [get]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResultItemMapping%23ResultItemMapping-method-set">Online Documentation</a>
 */
 override  operator fun set( key: TKey ,
 value: TValue )

companion object : ClassMetadata<ResultItemMapping<*, *>> {
}
}

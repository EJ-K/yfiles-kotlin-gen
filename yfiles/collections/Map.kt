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
import yfiles.lang.ClassMetadata

/**
 * The default implementation for [IMap].
 * @param [TKey] The type of the key elements of this dictionary.
 * @param [TValue] The type of the value elements of this dictionary.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap%23Map-constructor-Map">Online Documentation</a>
 */
@JsName("HashMap")
external open class Map<TKey : Any, TValue>  () : IMap<TKey, TValue>, ICollection<MapEntry<TKey, TValue>>, IEnumerable<MapEntry<TKey, TValue>> {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap%23isReadOnly">Online Documentation</a>
 */
final override val isReadOnly: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap%23keys">Online Documentation</a>
 */
final override val keys: ICollection<out TKey>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap%23values">Online Documentation</a>
 */
final override val values: ICollection<out TValue>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap%23Map-method-add">Online Documentation</a>
 */
 final override   fun add( item: MapEntry<TKey, TValue> )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap%23Map-method-clear">Online Documentation</a>
 */
 final override   fun clear()
/**
 * Whether this dictionary contains the given `value`.
 * @param [value] The value to search for.
 * @return `true` if this dictionary contains the given value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap%23Map-method-containsValue">Online Documentation</a>
 */
 final   fun containsValue( value: TValue ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap%23Map-method-copyTo">Online Documentation</a>
 */
 final override   fun copyTo( array: Array<in MapEntry<TKey, TValue>> ,
 arrayIndex: Int )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap%23Map-method-delete">Online Documentation</a>
 */
 final override   fun delete( key: TKey ):Boolean
/**
 * Gets the value of a given key.
 * @param [key] The key.
 * @return The value of the given key.
 * @see [set]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap%23Map-method-get">Online Documentation</a>
 */
 override  operator fun get( key: TKey ):TValue?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap%23Map-method-getEnumerator">Online Documentation</a>
 */
 final override   fun getEnumerator():IEnumerator<MapEntry<TKey, TValue>>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap%23Map-method-has">Online Documentation</a>
 */
 final override   fun has( key: TKey ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap%23Map-method-remove">Online Documentation</a>
 */
 final override   fun remove( item: MapEntry<TKey, TValue> ):Boolean
/**
 * Sets the value of a given key.
 * @param [key] The key.
 * @param [value] The value of the given key.
 * @see [get]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HashMap%23Map-method-set">Online Documentation</a>
 */
 override  operator fun set( key: TKey ,
 value: TValue )

companion object : ClassMetadata<Map<*, *>> {
}
}

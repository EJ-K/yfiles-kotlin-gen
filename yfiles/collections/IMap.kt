// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.collections

import yfiles.lang.InterfaceMetadata

/**
 * A collection of value objects which are mapped to key objects and can be queried using their keys.
 * @param [TKey] The type of the keys.
 * @param [TValue] The type of the values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMap">Online Documentation</a>
 */
external interface IMap<TKey : Any, TValue> : IMapper<TKey, TValue>, ICollection<MapEntry<TKey, TValue>> {
/**
 * A [ICollection] of the keys of this dictionary.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMap%23keys">Online Documentation</a>
 */
val keys: ICollection<out TKey>
/**
 * A [ICollection] of the values of this dictionary.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMap%23values">Online Documentation</a>
 */
val values: ICollection<out TValue>
/**
 * Removes the key/value pair which is represented by the given `key`.
 * @param [key] The key of the key/value pair to remove.
 * @return `true` if a key/value pair with the given key was removed from this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMap%23IMap-method-delete">Online Documentation</a>
 */
   fun delete( key: TKey ):Boolean
/**
 * Whether this dictionary's key collection contains the given key.
 * @param [key] The key to search for.
 * @return `true` if this dictionary contains the given `key`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMap%23IMap-method-has">Online Documentation</a>
 */
   fun has( key: TKey ):Boolean

companion object : InterfaceMetadata<IMap<*, *>> {
}
}

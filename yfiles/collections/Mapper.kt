// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.collections

import yfiles.lang.ClassMetadata

/**
 * An [IMapper] implementation backed by a [IMap].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Mapper">Online Documentation</a>
 * 
 * @constructor Creates an instance using the provided [Map] as the backing store.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Mapper%23Mapper-constructor-Mapper(IMap)">Online Documentation</a>
 */
external  class Mapper<K : Any, V>  ( dictionary: IMap<K, V>  = definedExternally) : IMapper<K, V> {

/**
 * Gets or sets the default value to return if no specific value has been set for a given key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Mapper%23defaultValue">Online Documentation</a>
 */
final var defaultValue: V?
/**
 * Gets an enumerable over all entries in this (dictionary based) mapper.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Mapper%23entries">Online Documentation</a>
 */
final val entries: IEnumerable<MapEntry<K, V>>
/**
 * Calls [Map.clear] on the backing implementation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Mapper%23Mapper-method-clear">Online Documentation</a>
 */
 final   fun clear()
/**
 * Removes the mapping of the given key.
 * @param [key] The key of the mapping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Mapper%23Mapper-method-delete">Online Documentation</a>
 */
 final   fun delete( key: K? )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Mapper%23Mapper-method-get">Online Documentation</a>
 */
 override  operator fun get( key: K ):V?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Mapper%23Mapper-method-set">Online Documentation</a>
 */
 override  operator fun set( key: K ,
 value: V )

companion object : ClassMetadata<Mapper<*, *>> {
}
}

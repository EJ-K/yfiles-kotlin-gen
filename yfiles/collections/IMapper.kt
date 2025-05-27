// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.collections

import yfiles.graph.MapperDelegate
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * An interface for typed dictionary-like implementations.
 * @param [K] The type of element this interface accepts as keys for the mapping.
 * @param [V] The type of element this interface accepts as values for the mapping.
 * @see [Mapper]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapper">Online Documentation</a>
 */
external interface IMapper<K : Any, V> : YObject {
/**
 * Gets the value for a given key in the mapping.
 * @param [key] The key of the mapping.
 * @return The value.
 * @see [set]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapper%23IMapper-method-get">Online Documentation</a>
 */
  operator fun get( key: K ):V?
/**
 * Sets the value for a given key in the mapping.
 * @param [key] The key of the mapping.
 * @param [value] The value.
 * @see [get]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapper%23IMapper-method-set">Online Documentation</a>
 */
  operator fun set( key: K ,
 value: V )

companion object : InterfaceMetadata<IMapper<*, *>> {
/**
 * Creates a constant mapper that will always return the `constant`.
 * @param [K] The type of the key to use.
 * @param [V] The type of the value to use.
 * @param [constant] The constant to return in [get]
 * @return A new instance that will always return the same constant.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapper%23IMapper-defaultmethod-fromConstant">Online Documentation</a>
 */
@JsName("fromConstant")
  operator fun <K : Any, V>invoke( constant: V ):IMapper<K, V>
/**
 * Create an implementation of [IMapper] that delegates [get] getter calls to the provided handler.
 * @param [K] The type of the key to use.
 * @param [V] The type of the value to use.
 * @param [getter] The delegate to delegate [get] getter calls to.
 * @return An implementation that delegates to `getter`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMapper%23IMapper-defaultmethod-fromDelegate">Online Documentation</a>
 */
@JsName("fromDelegate")
  operator fun <K : Any, V>invoke( getter: MapperDelegate<K, V> ):IMapper<K, V>
}
}

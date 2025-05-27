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
import yfiles.lang.YObject

/**
 * The key/value pair of a [IMap].
 * @param [TKey] The type of the key element.
 * @param [TValue] The type of the value element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapEntry">Online Documentation</a>
 * 
 * @constructor Creates a new instance with the given `key` and `value`.
 * @param [key] The key for this pair.
 * @param [value] The value for this pair.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapEntry%23MapEntry-constructor-MapEntry">Online Documentation</a>
 * 
 * @property key
 * The key for this key/value pair.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapEntry%23key">Online Documentation</a>
 * 
 * @property value
 * The value for this key/value pair.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapEntry%23value">Online Documentation</a>
 */
external  class MapEntry<TKey : Any, TValue>  (
final val key: TKey,
final val value: TValue) : YObject {

companion object : ClassMetadata<MapEntry<*, *>> {
}
}

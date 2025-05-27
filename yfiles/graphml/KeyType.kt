// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration for the allowed data types of a GraphML attribute.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyType">Online Documentation</a>
 */
external sealed class KeyType: YEnum<KeyType> {
   companion object: EnumMetadata<KeyType> {
       /**
 * Identifier for attribute of type `int`.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyType%23INT">Online Documentation</a>
 */
val INT: KeyType

/**
 * Identifier for attribute of type `long`.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyType%23LONG">Online Documentation</a>
 */
val LONG: KeyType

/**
 * Identifier for attribute of type `float`.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyType%23FLOAT">Online Documentation</a>
 */
val FLOAT: KeyType

/**
 * Identifier for attribute of type `double`.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyType%23DOUBLE">Online Documentation</a>
 */
val DOUBLE: KeyType

/**
 * Identifier for attribute of type `string` that denotes string content as opposed to [COMPLEX].
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyType%23STRING">Online Documentation</a>
 */
val STRING: KeyType

/**
 * Identifier for attribute of type `boolean`.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyType%23BOOLEAN">Online Documentation</a>
 */
val BOOLEAN: KeyType

/**
 * Identifier for arbitrary complex xml content
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyType%23COMPLEX">Online Documentation</a>
 */
val COMPLEX: KeyType
   }
}

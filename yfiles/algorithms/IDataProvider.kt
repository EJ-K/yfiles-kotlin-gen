// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * A general interface for data provision.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDataProvider">Online Documentation</a>
 */
external interface IDataProvider<in K : YObject, out V : Any> : YObject {
/**
 * Returns an object value associated with the given data holder.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDataProvider%23IDataProvider-method-get">Online Documentation</a>
 */
  operator fun get( dataHolder: K ):V?
/**
 * Returns a boolean value associated with the given data holder.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDataProvider%23IDataProvider-method-getBoolean">Online Documentation</a>
 */
   fun getBoolean( dataHolder: K ):Boolean
/**
 * Returns an integer value associated with the given data holder.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDataProvider%23IDataProvider-method-getInt">Online Documentation</a>
 */
   fun getInt( dataHolder: K ):Int
/**
 * Returns a double value associated with the given data holder.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDataProvider%23IDataProvider-method-getNumber">Online Documentation</a>
 */
   fun getNumber( dataHolder: K ):Double

companion object : InterfaceMetadata<IDataProvider<*, *>> {
}
}

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
 * A general interface for setting data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDataAcceptor">Online Documentation</a>
 */
external interface IDataAcceptor<in K : YObject, in V : Any> : YObject {
/**
 * Sets an object value associated with the given data holder.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDataAcceptor%23IDataAcceptor-method-set">Online Documentation</a>
 */
  operator fun set( dataHolder: K ,
 value: V? )
/**
 * Sets a boolean value associated with the given data holder.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDataAcceptor%23IDataAcceptor-method-setBoolean">Online Documentation</a>
 */
   fun setBoolean( dataHolder: K ,
 value: Boolean )
/**
 * Sets an integer value associated with the given data holder.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDataAcceptor%23IDataAcceptor-method-setInt">Online Documentation</a>
 */
   fun setInt( dataHolder: K ,
 value: Int )
/**
 * Sets a double value associated with the given data holder.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDataAcceptor%23IDataAcceptor-method-setNumber">Online Documentation</a>
 */
   fun setNumber( dataHolder: K ,
 value: Double )

companion object : InterfaceMetadata<IDataAcceptor<*, *>> {
}
}
